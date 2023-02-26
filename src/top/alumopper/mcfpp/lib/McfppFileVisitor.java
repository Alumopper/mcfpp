package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.*;
import top.alumopper.mcfpp.lang.Bool;
import top.alumopper.mcfpp.lang.Int;
import top.alumopper.mcfpp.lang.Var;

/**
 * 在编译工程之前，应当首先将所有文件中的资源全部遍历一次并写入缓存。
 */
public class McfppFileVisitor extends mcfppBaseVisitor<Object>{

    /**
     * 遍历整个文件。一个文件包含了命名空间的声明，函数的声明，类的声明以及全局变量的声明。全局变量是可以跨文件调用的。
     * <pre>
     *     <code>
     * compilationUnit
     *     :   namespaceDeclaration?
     *         (   typeDeclaration
     *         |   fieldDeclaration ';'
     *         )*
     *         EOF
     *     ;
     *     </code>
     * </pre>
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public Object visitCompilationUnit(mcfppParser.CompilationUnitContext ctx){
        //命名空间
        Project.currNamespace = ctx.namespaceDeclaration().Identifier().getText();
        //文件结构
        for (mcfppParser.TypeDeclarationContext t : ctx.typeDeclaration()) {
            visit(t);
        }
        for (mcfppParser.FieldDeclarationContext f : ctx.fieldDeclaration()) {
            visit(f);
        }
        return null;
    }

    /**
     * 类或者函数的声明
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public Object visitTypeDeclaration(mcfppParser.TypeDeclarationContext ctx){
        visit(ctx.classOrFunctionDeclaration());
        return null;
    }

    /**
     * 类或函数声明
     * <pre>
     * {@code
     * classOrFunctionDeclaration
     *     :   classDeclaration
     *     |   functionDeclaration
     *     |   nativeDeclaration
     *     ;}
     * </pre>
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public Object visitClassOrFunctionDeclaration(mcfppParser.ClassOrFunctionDeclarationContext ctx){
        if(ctx.classDeclaration() != null){
            visit(ctx.classDeclaration());
        }else if(ctx.functionDeclaration() != null){
            visit(ctx.functionDeclaration());
        }else {
            visit(ctx.nativeDeclaration());
        }
        return null;
    }

    /**
     * 类的声明
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public Object visitClassDeclaration(mcfppParser.ClassDeclarationContext ctx){
        //注册类
        String identifier = ctx.className(0).getText();
        if(Project.global.cache.classes.containsKey(identifier)){
            //重复声明
            Project.logger.error("The class has extended " + Class.currClass.identifier +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            Project.errorCount ++;
            throw new ClassDuplicationException();
        }else {
            //如果没有声明过这个类
            Class cls;
            if(ctx.className(0).Identifier() != null){
                //声明了命名空间
                cls = new Class(identifier, ctx.className(0).Identifier().getText());
            }else {
                cls = new Class(identifier);
            }
            if(ctx.className().size() != 1){
                if(Project.global.cache.classes.containsKey(ctx.className(1).getText())){
                    cls.parent = Project.global.cache.classes.get(ctx.className(1).getText());
                }else {
                    Project.logger.error("Undefined class: " + ctx.className(1).getText() +
                            " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                    Project.errorCount++;
                }
            }
            Project.global.cache.classes.put(identifier,cls);
            Class.currClass = cls;
        }
        //解析类中的成员
        for (mcfppParser.ClassMemberDeclarationContext c : ctx.classBody().classMemberDeclaration()) {
            visit(c);
        }
        Class.currClass = null;
        return null;
    }

    /**
     * 类字段的声明
     * <pre>
     * {@code
     * classMemberDeclaration
     * :   accessModifier? (STATIC)? classMember
     * ;
     * }</pre>
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public Object visitClassMemberDeclaration(mcfppParser.ClassMemberDeclarationContext ctx){
        ClassMember m = (ClassMember) visit(ctx.classMember());
        //访问修饰符，静态修饰符
        //判断访问修饰符和静态标识符
        if(ctx.accessModifier() != null){
            m.setAccessModifier(ClassMember.AccessModifier.valueOf(ctx.accessModifier().getText().toUpperCase()));
        }
        if(ctx.STATIC() != null){
            m.setIsStatic(true);
        }
        return null;
    }

    /**
     * 类方法的声明
     * @param ctx the parse tree
     * @return 这个类方法的对象
     */
    @Override
    public Object visitClassFunctionDeclaration(mcfppParser.ClassFunctionDeclarationContext ctx){
        //创建函数对象
        Function f = new Function(ctx.Identifier().getText(), Class.currClass);
        //解析参数
        if(ctx.parameterList() != null){
            f.addParams(ctx.parameterList());
        }
        //注册函数
        if(!Class.currClass.cache.functions.contains(f)){
            Class.currClass.cache.functions.add(f);
        }else {
            Project.logger.error("Already defined function:" + ctx.Identifier().getText() + "in class " + Class.currClass.identifier+
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            Project.errorCount ++;
            Function.currFunction = Function.nullFunction;
        }
        return f;
    }

    /**
     * 构造函数的声明
     * @param ctx the parse tree
     * @return 这个构造函数的对象
     */
    @Override
    public Object visitConstructorDeclaration(mcfppParser.ConstructorDeclarationContext ctx){
        //是构造函数
        //创建构造函数对象，注册函数
        Constructor f = null;
        try {
            f = new Constructor(Class.currClass);
        }catch (FunctionDuplicationException e){
            Project.logger.error("Already defined function: " + ctx.className().getText() + "(" + ctx.parameterList().getText() + ")" +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
        }
        //解析参数
        assert f != null;
        if(ctx.parameterList() != null){
            f.addParams(ctx.parameterList());
        }
        return f;
    }

    @Override
    public Object visitNativeConstructorDeclaration(mcfppParser.NativeConstructorDeclarationContext ctx){
        //TODO
        throw new TODOException("");
    }

    /**
     * 函数的声明
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public Object visitFunctionDeclaration(mcfppParser.FunctionDeclarationContext ctx){
        //创建函数对象
        Function f;
        //函数是否拥有命名空间声明
        if(ctx.namespaceID().Identifier().size() == 1){
            f = new Function(ctx.namespaceID().Identifier(0).getText());
        }else {
            f = new Function(ctx.namespaceID().Identifier(0).getText(),ctx.namespaceID().Identifier(1).getText());
        }
        //解析参数
        if(ctx.parameterList() != null){
            f.addParams(ctx.parameterList());
        }
        //解析函数的tag
        if(ctx.functionTag() != null){
            FunctionTag functionTag;
            if(ctx.functionTag().namespaceID().Identifier().size() == 1){
                functionTag = new FunctionTag(FunctionTag.MINECRAFT,ctx.functionTag().namespaceID().Identifier(0).getText());
            }else {
                functionTag = new FunctionTag(ctx.functionTag().namespaceID().Identifier(0).getText(),ctx.functionTag().namespaceID().Identifier(1).getText());
            }
            f.tag = functionTag;
        }
        //不是类的成员
        f.isClassMember = false;
        if(Project.global.cache.getFunction(f.namespace,f.name,f.getParamTypeList()) == null){
            Project.global.cache.functions.add(f);
        }else {
            Project.logger.error("Already defined function:" + f.getNamespaceID() +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            Project.errorCount ++;
            Function.currFunction = Function.nullFunction;
        }

        if(f.tag != null && (f.tag.equals(FunctionTag.TICK) || f.tag.equals(FunctionTag.LOAD)) && ((mcfppParser.FunctionDeclarationContext) ctx.parent).parameterList().parameter().size() != 0){
            Project.logger.error("Entrance function shouldn't have parameter:" + f.getNamespaceID() +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            Project.errorCount ++;
        }
        return null;
    }

    /**
     * native函数的声明
     * @param ctx the parse tree
     * @return 如果是全局，返回null，否则返回这个函数对象
     */
    @Override
    public Object visitNativeDeclaration(mcfppParser.NativeDeclarationContext ctx){
        NativeFunction nf;
        try{
            nf = new NativeFunction(ctx.Identifier().getText(),ctx.javaRefer());
        }catch (IllegalFormatException e){
            Project.logger.error("Illegal Java Method Name:" + e.getMessage() +
                    " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
            return null;
        }
        if(ctx.parameterList() != null){
            nf.addParams(ctx.parameterList());
        }
        if(Class.currClass == null){
            //是普通的函数
            nf.isClassMember = false;
            if(!Project.global.cache.functions.contains(nf)){
                Project.global.cache.functions.add(nf);
            }else {
                Project.logger.error("Already defined function:" + ctx.Identifier().getText()+
                        " at " + Project.currFile.getName() + " line: " + ctx.getStart().getLine());
                Project.errorCount ++;
                Function.currFunction = Function.nullFunction;
            }
        }
        //是类成员
        nf.isClassMember = true;
        nf.parentClass = Class.currClass;
        return nf;
    }

    /**
     * 全局变量或类字段的声明
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public Object visitFieldDeclaration(mcfppParser.FieldDeclarationContext ctx){
        //变量生成
        Var var = null;
        CacheContainer curr;
        //变量注册
        if(Class.currClass == null){
            curr = Project.global;
        }else{
            curr = Class.currClass;
        }
        var = Var.varBuild(ctx,curr);
        assert var != null;
        //变量注册或字段返回
        if(Class.currClass == null){
            if(!Project.global.cache.putVar(ctx.Identifier().getText(),var)){
                Project.logger.error("Duplicate defined variable name:" + ctx.Identifier().getText() +
                        " at " + Project.currFile.getName() + " line:" + ctx.getStart().getLine());
                Project.errorCount ++;
                throw new VariableDuplicationException();
            }
            return null;
        }else {
            //是类变量
            if(!Class.currClass.cache.putVar(ctx.Identifier().getText(),var)){
                Project.logger.error("Duplicate defined variable name:" + ctx.Identifier().getText() +
                        " at " + Project.currFile.getName() + " line:" + ctx.getStart().getLine());
                Project.errorCount ++;
                throw new VariableDuplicationException();
            }
            return var;
        }
    }
}
