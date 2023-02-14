package top.alumopper.mcfpp;

import top.alumopper.mcfpp.lib.UwU;

/**
 * 编译器的启动入口
 */
public class App {
    public static void main(String[] args) throws Exception {
        if(args.length == 1){
            Project.logger.info("Tips: " + UwU.getTip());
            String path = args[0];
            Project.readProject(path);
            Project.compile();
            Project.optimization();
            Cache.printAll();
        }
    }
}
