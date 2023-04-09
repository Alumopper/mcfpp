package top.alumopper.mcfpp.io;

import com.alibaba.fastjson.JSON;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.lib.Class;
import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.lib.FunctionTag;
import top.alumopper.mcfpp.lib.Native;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static top.alumopper.mcfpp.Project.global;
import static top.alumopper.mcfpp.Project.logger;

/**
 * 用于创建一个数据包的框架。
 * 一个完整的数据包包含(加粗者为重要组成部分，也是默认包含的部分):
 * <ul>
 *     <li><b>进度(advancement)</b></li>
 *     <li>聊天类型(chat_type)</li>
 *     <li>数据包(datapacks)</li>
 *     <li><b>函数(functions)</b></li>
 *     <li><b>战利品表(loot_tables)</b></li>
 *     <li><b>谓词(predicates)</b></li>
 *     <li>结构(structures)</li>
 *     <li>配方(recipes)</li>
 *     <li><b>物品修饰器(item_modifiers)</b></li>
 *     <li><b>标签(tags)</b></li>
 *     <li>维度(dimension)</li>
 *     <li>维度类型(dimension_type)</li>
 *     <li>世界生成(worldgen)</li>
 * </ul>
 * 加粗的部分表示对一般数据包的逻辑实现几乎必不可少的部分。
 */
public class DatapackCreator {
    /**
     * TODO
     * 在指定的路径生成一个数据包的框架
     * @param path 路径
     */
    public static void createDatapack(String path){
        Project.logger.debug("Clearing output folder...");
        //清空原输出文件夹
        delAllFile(new File(path + "/out"));
        Project.logger.debug("Creating datapack...");
        //生成
        DatapackMcMeta datapackMcMeta = new DatapackMcMeta(new DatapackMcMeta.Pack(Project.getVersion(Project.version), Project.description));
        String datapackMcMetaJson = JSON.toJSONString(datapackMcMeta);
        //创建文件夹
        try {
            Files.createDirectories(Paths.get(path + "/out/data"));
            //创建pack.mcmeta

            Files.write(Paths.get(path + "/out/pack.mcmeta"), datapackMcMetaJson.getBytes());
            //写入函数文件
            for (Function f: global.cache.functions) {
                if(f instanceof Native){
                    continue;
                }
                logger.debug("Writing File: " + path + "/out/data/" + f.namespace + "/functions/" + f.name + ".mcfunction");
                Files.createDirectories(Paths.get(path + "/out/data/" + f.namespace + "/functions"));
                Files.write(Paths.get(path + "/out/data/" + f.namespace + "/functions/" + f.name + ".mcfunction"), f.getCmdStr().getBytes());
            }
            //写入类的函数文件
            for (Class cls : global.cache.classes.values()){
                if(cls instanceof Native){
                    continue;
                }
                //成员
                for (Function f: cls.cache.functions){
                    if(f instanceof Native){
                        continue;
                    }
                    logger.debug("Writing File: " + path + "/out/data/" + cls.namespace + "/functions/" + cls.identifier + "/" + f.name + ".mcfunction");
                    Files.createDirectories(Paths.get(path + "/out/data/" + cls.namespace + "/functions/"+ cls.identifier ));
                    Files.write(Paths.get(path + "/out/data/" + cls.namespace + "/functions/" + cls.identifier + "/" + f.name + ".mcfunction"), f.getCmdStr().getBytes());
                }
                //静态
                for (Function f: cls.staticCache.functions){
                    if(f instanceof Native){
                        continue;
                    }
                    logger.debug("Writing File: " + path + "/out/data/" + cls.namespace + "/functions/" + cls.identifier + "/static/" + f.name + ".mcfunction");
                    Files.createDirectories(Paths.get(path + "/out/data/" + f.namespace + "/functions/"+ cls.identifier + "/static"));
                    Files.write(Paths.get(path + "/out/data/" + cls.namespace + "/functions/" + cls.identifier + "/static/" + f.name + ".mcfunction"), f.getCmdStr().getBytes());
                }
            }
            //写入标签json文件
            for (FunctionTag tag : global.functionTags.values()) {
                logger.debug("Writing File: " +path + "/out/data/" + tag.namespace + "/tags/functions/" + tag.tag + ".json");
                Files.write(Paths.get(path + "/out/data/" + tag.namespace + "/tags/functions/" + tag.tag + ".json"), tag.getTagJSON().getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        global.globalInit.namespace = Project.name;
        global.cache.functions.add(global.globalInit);
    }

    static class DatapackMcMeta{
        static class Pack{
            int pack_format;
            String description;

            public Pack(int pack_format, String description){
                this.pack_format = pack_format;
                this.description = description;
            }
        }

        Pack pack;

        public DatapackMcMeta(Pack pack){
            this.pack = pack;
        }
    }

    /**
     * 删除文件或文件夹
     * @param directory 文件或文件夹
     */
    public static void delAllFile(File directory){
        if (!directory.isDirectory()){
            directory.delete();
        } else{
            File [] files = directory.listFiles();

            // 空文件夹
            if (files.length == 0){
                directory.delete();
                return;
            }

            // 删除子文件夹和子文件
            for (File file : files){
                if (file.isDirectory()){
                    delAllFile(file);
                } else {
                    file.delete();
                }
            }

            // 删除文件夹本身
            directory.delete();
        }
    }
}
