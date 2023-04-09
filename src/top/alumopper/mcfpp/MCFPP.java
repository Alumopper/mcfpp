package top.alumopper.mcfpp;

import top.alumopper.mcfpp.io.DatapackCreator;
import top.alumopper.mcfpp.lib.Cache;
import top.alumopper.mcfpp.lib.UwU;

/**
 * 编译器的启动入口
 */
public class MCFPP {
    public static void main(String[] args) throws Exception {
        if(args.length == 1){
            long start = System.currentTimeMillis();
            Project.logger.info("Tips: " + UwU.getTip());   //生成tips
            String path = args[0];
            Project.init(); //初始化
            Project.readProject(path);  //读取
            Project.analyse();  //解析
            Project.compile();  //编译
            Project.optimization(); //优化
            Project.genIndex(); //生成索引
            DatapackCreator.createDatapack(Project.root.getAbsolutePath()); //生成数据包
            Project.logger.info("Finished in " + (System.currentTimeMillis()-start) + "ms");
            Cache.printAll();
        }
    }
}
