package top.alumopper.mcfpp;

import top.alumopper.mcfpp.lib.Cache;
import top.alumopper.mcfpp.lib.UwU;

/**
 * 编译器的启动入口
 */
public class App {
    public static void main(String[] args) throws Exception {
        if(args.length == 1){
            long start = System.currentTimeMillis();
            Project.logger.info("Tips: " + UwU.getTip());
            String path = args[0];
            Project.readProject(path);
            Project.analyse();
            Project.compile();
            Project.optimization();
            Project.logger.info("Finished in " + (System.currentTimeMillis()-start) + "ms");
            Cache.printAll();
        }
    }
}
