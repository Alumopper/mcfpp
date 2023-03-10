package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.*;
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
     *         typeDeclaration *
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
        //文件结构，类和函数
        for (mcfppParser.TypeDeclarationContext t : ctx.typeDeclaration()) {
            visit(t);
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
            cls.isStaticClass = ctx.STATIC() != null;
        }
        //解析类中的成员
        //先静态
        //先解析函数
        for(mcfppParser.StaticClassMemberDeclarationContext c : ctx.classBody().staticClassMemberDeclaration()){
            if(c.classMember().fieldDeclaration() == null){
                visit(c);
            }
        }
        //再解析变量
        for(mcfppParser.StaticClassMemberDeclarationContext c : ctx.classBody().staticClassMemberDeclaration()){
            if(c.classMember().fieldDeclaration() != null){
                visit(c);
            }
        }
        //后成员
        //先解析函数和构造函数
        for (mcfppParser.ClassMemberDeclarationContext c : ctx.classBody().classMemberDeclaration()) {
            if(c.classMember().fieldDeclaration() == null){
                visit(c);
            }
        }
        //再解析变量
        for (mcfppParser.ClassMemberDeclarationContext c : ctx.classBody().classMemberDeclaration()) {
            if(c.classMember().fieldDeclaration() != null){
                visit(c);
            }
        }
        //如果没有构造函数，自动添加默认的空构造函数
        if(Class.currClass.constructors.size() == 0){
            new Constructor(Class.currClass);
        }
        Class.currClass = null;
        return null;
    }

    @Override
    public Object visitStaticClassMemberDeclaration(mcfppParser.StaticClassMemberDeclarationContext ctx){
        ClassMember m = (ClassMember) visit(ctx.classMember());
        Class.currClass.addMember((ClassMember) visit(ctx.classMember()));
        //访问修饰符
        if(ctx.accessModifier() != null){
            m.setAccessModifier(ClassMember.AccessModifier.valueOf(ctx.accessModifier().getText().toUpperCase()));
        }
        m.setIsStatic(true);
        return null;
    }

    /**
     * 类成员的声明。由于函数声明可以后置，因此需要先查明函数声明情况再进行变量的注册以及初始化。
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
        Class.currClass.addMember((ClassMember) visit(ctx.classMember()));
        //访问修饰符
        if(ctx.accessModifier() != null){
            m.setAccessModifier(ClassMember.AccessModifier.valueOf(ctx.accessModifier().getText().toUpperCase()));
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
        Function f = new Function(ctx.Identifier().getText(), Class.currClass, ctx.parent instanceof mcfppParser.StaticClassMemberDeclarationContext);
        //解析参数
        if(ctx.parameterList() != null){
            f.addParams(ctx.parameterList());
        }
        //注册函数
        if(Class.currClass.cache.functions.contains(f) || Class.currClass.staticCache.functions.contains(f)){
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
     * 类字段的声明
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public Object visitFieldDeclaration(mcfppParser.FieldDeclarationContext ctx){
        //变量生成
        Var var = Var.build(ctx,Class.currClass);
        assert var != null;
        //只有可能是类变量
        if(Class.currClass.cache.containVar(ctx.Identifier().getText()) || Class.currClass.staticCache.containVar(ctx.Identifier().getText())){
            Project.logger.error("Duplicate defined variable name:" + ctx.Identifier().getText() +
                    " at " + Project.currFile.getName() + " line:" + ctx.getStart().getLine());
            Project.errorCount ++;
            throw new VariableDuplicationException();
        }
        //变量的初始化
        if(ctx.expression() != null){
            Function.currFunction = Class.currClass.classInit;
            Function.addCommand("#" + ctx.getText());
            Var init = new McfppExprVisitor().visit(ctx.expression());
            try{
                var.assign(init);
            }catch (VariableConverseException e){
                Project.logger.error("Cannot convert " + init.getClass() + " to " + var.getClass() +
                        " at " + Class.currClass.identifier + " line:" + ctx.getStart().getLine());
                Project.errorCount ++;
                Function.currFunction = null;
                throw new VariableConverseException();
            }
            Function.currFunction = null;
        }
        return var;
    }
}
