package top.alumopper.mcfpp.test;

import top.alumopper.mcfpp.type.Var;

public class NativeTest1{
    public static void test(Var[] vars){
        System.out.println("MNI > Hello Minecraft!");
        for (Var v : vars) {
            System.out.println("MNI > Get argument " + v.identifier);
        }
    }
}
