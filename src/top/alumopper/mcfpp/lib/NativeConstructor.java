package top.alumopper.mcfpp.lib;

import top.alumopper.mcfpp.lang.ClassObject;
import top.alumopper.mcfpp.lang.Var;

import java.util.ArrayList;

public class NativeConstructor extends Constructor implements Native {
    public NativeConstructor(Class cls) {
        super(cls);
    }

    @Override
    public void invoke(ArrayList<Var> args, int lineNo, ClassObject obj) {
        super.invoke(args, lineNo, obj);
    }
}
