package top.alumopper.mcfpp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import top.alumopper.mcfpp.lib.Cache;
import top.alumopper.mcfpp.lib.Class;
import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.io.McfppFileReader;
import top.alumopper.mcfpp.lib.Global;
import top.alumopper.mcfpp.lib.Native;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 一个工程。工程文件包含了这个mcfpp工程编译需要的所有信息。编译器将会以这个文件为入口开始编译。
 * 同时，这个工程文件的名字也是此文件编译生成的数据包的命名空间。
 */
public abstract class Project {
    public static Logger logger = Logger.getLogger("mcfpp");
    static {
        PropertyConfigurator.configure("log4j.properties");
    }

    /**
     * 工程的根目录
     */
    public static File root;

    /**
     * 工程的名字
     */
    public static String name;

    /**
     * 工程包含的所有文件。以绝对路径保存
     */
    static ArrayList<String> files;

    /**
     * 工程对应的mc版本
     */
    public static String version;

    /**
     * 数据包的描述。原始Json文本 TODO
     */
    public static String description;

    /**
     *  工程包含的所有引用
     */
    static ArrayList<String> includes;

    /**
     * 编译时，当前编译的文件
     */
    public static File currFile;

    /**
     * 当前的命名空间
     */
    public static String currNamespace;

    /**
     * 工程中的总错误数量
     */
    public static int errorCount;

    /**
     * 工程中的总警告数量
     */
    public static int warningCount;

    /**
     * 全局缓存
     */
    public static Global global = new Global();


    public static void init(){
        global.init();
    }

    /**
     * 读取工程
     * @param path 工程的json文件的路径
     */
    public static void readProject(String path){
        //工程信息读取
        try{
            logger.debug("Reading project from file \"" + path + "\"");
            BufferedReader reader = new BufferedReader(new FileReader(path));
            File qwq = new File(path);
            root = qwq.getParentFile();
            name = qwq.getName().substring(0,qwq.getName().lastIndexOf('.'));
            StringBuilder json = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null){
                json.append(line);
            }
            JSONObject jsonObject = (JSONObject) JSONObject.parse(json.toString());
            files = new ArrayList<>();
            JSONArray filesJson = jsonObject.getJSONArray("files");
            if(filesJson == null){
                logger.error("Missing key \"files\" in project json file");
                errorCount++;
            }else {
                for (Object o : filesJson.toArray()) {
                    String s = (String) o;
                    if(s.endsWith("*")){
                        //通配符
                        s = s.substring(0,s.length()-1);
                    }
                    File r;
                    if(s.length() > 2 && s.charAt(1) == ':'){
                        //绝对路径
                        r = new File(s);
                    }else {
                        //相对路径
                        r = new File(root.getAbsolutePath() + s);
                    }
                    logger.info("Finding file in \"" + r.getAbsolutePath() + "\"");
                    getFiles(r, files);
                }
            }
            version = jsonObject.getString("version");
            if(version == null){
                version = "1.20";
            }
            description = jsonObject.getString("description");
            if(description == null){
                description = "A datapack compiled by MCFPP";
            }
            includes = new ArrayList<>();
            JSONArray includesJson = jsonObject.getJSONArray("includes");
            if(includesJson != null){
                for (int i = 0; i < includesJson.size(); i++) {
                    includes.add(includesJson.getString(i));
                }
            }
        }catch (Exception e){
            logger.error("Error while reading project from file \"" + path + "\"");
            errorCount ++;
            e.printStackTrace();
        }
    }

    /**
     * 解析工程
     */
    public static void analyse(){
        assert files != null;
        Project.logger.debug("Analysing project...");
        //解析文件
        for (String file : files){
            try{
                new McfppFileReader(file).analyse();
            }catch (IOException e){
                Project.logger.error("Error while analysing file \"" + file + "\"");
                errorCount++;
                e.printStackTrace();
            }
        }
    }

    /**
     * 编译工程
     */
    public static void compile(){
        //工程文件编译
        assert files != null;
        //解析文件
        for (String file : files) {
            Project.logger.debug("Compiling mcfpp code in \"" + file + "\"");
            try{
                new McfppFileReader(file).compile();
            }catch (IOException e){
                Project.logger.error("Error while compiling file \"" + file + "\"");
                errorCount++;
                e.printStackTrace();
            }
        }
    }

    /**
     * 整理并优化工程
     */
    public static void optimization(){
        logger.debug("Optimizing...");
        //寻找入口函数
        boolean hasEntrance = false;
        for (Function f : Project.global.cache.functions) {
            if(f.parent.size() == 0 && !(f instanceof Native)){
                //找到了入口函数
                hasEntrance = true;
                f.commands.add(0,"data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
                Project.logger.debug("Find entrance function:" + (f.tag==null?"":f.tag) + " " + f.name);
            }
        }
        if(!hasEntrance){
            Project.logger.warn("No valid entrance function in Project " + Project.name);
            Project.warningCount ++;
        }
        logger.info("Complete compiling project " + root.getName() + " with [" + errorCount + "] error and [" + warningCount + "] warning");
    }

    /**
     * 生成库索引
     * 在和工程信息json文件的同一个目录下生成一个.mclib文件
     */
    public static void genIndex(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(root.getAbsolutePath() + "/.mclib"));
            writer.write("[function]\n");
            for (Function f : Project.global.cache.functions) {
                writer.write(f.getNamespaceID() + "\n");
            }
            writer.write("[class]\n");
            for (Class c : Project.global.cache.classes.values()) {
                writer.write(c.namespace + ":" + c.identifier + "\n");
            }
            writer.write("[end]\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取文件列表
     * @param file 根目录
     * @param files 储存文件用的数组
     */
    private static void getFiles(File file, ArrayList<String> files){
        if(!file.exists()){
            Project.logger.warn("Path \"" + file.getAbsolutePath() + "\" doesn't exist. Ignoring.");
            Project.warningCount ++;
            return;
        }
        File[] fs = file.listFiles();
        if(fs == null){
            return;
        }
        for(File f:fs){
            if(f.isDirectory())	//若是目录，则递归打印该目录下的文件
                getFiles(f,files);
            if(f.isFile() && f.getName().substring(f.getName().lastIndexOf(".")+1).equals("mcfpp")){
                if(!files.contains(f.getAbsolutePath())){
                    files.add(f.getAbsolutePath());
                }
            }
        }
    }

    /**
     * 获取数据包版本
     * @param version 版本字符串
     * @return 版本编号
     */
    public static int getVersion(String version){
        switch (version){
            case "1.20" -> {return 13;}
            case "1.19.4" -> {return 12;}
            case "23w03a" -> {return 11;}
            case "1.19.3", "1.19.2", "1.19.1", "1.19" -> {return 10;}
            case "1.18.2" -> {return 9;}
            case "1.18.1", "1.18" -> {return 8;}
            case "1.17.1", "1.17" -> {return 7;}
            case "1.16.5", "1.16.4", "1.16.3", "1.16.2" -> {return 6;}
            case "1.16.1" ," 1.16", "1.15.2", "1.15.1", "1.15" -> {return 5;}
            case "1.14.4", "1.14.3", "1.14.2", "1.14.1", "1.14", "1.13.2", "1.13.1", "1.13" -> {return 4;}
            case "17w43a" -> {return 3;}
            default -> {
                Project.logger.warn("Unknown version: \"" + version + "\". Using 1.20 (13)");
                return 13;
            }
        }
    }
}