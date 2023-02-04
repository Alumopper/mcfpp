package top.alumopper.mcfpp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import top.alumopper.mcfpp.lib.Function;
import top.alumopper.mcfpp.reader.McfppFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 一个工程。工程文件包含了这个mcfpp工程编译需要的所有信息。编译器将会以这个文件为入口开始编译。
 * 同时，这个工程文件的名字也是此文件编译生成的数据包的命名空间。
 */
public class Project {
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
    static String version;

    /**
     *  工程包含的所有引用
     */
    static ArrayList<String> includes;

    public static File currFile;

    public static int errorCount;

    public static int warningCount;

    /**
     * 读取工程
     * @param path 工程的json文件的路径
     */
    public static void readProject(String path){
        //工程信息读取
        try{
            logger.debug("Reading project from file \"" + path + "\"");
            BufferedReader reader = new BufferedReader(new FileReader(path));
            root = new File(path).getParentFile();
            name = root.getName();
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
        for (Function f : Cache.functions.values()) {
            if(f.parent.size() == 0){
                //找到了入口函数
                hasEntrance = true;
                f.commands.add(0,"data modify storage mcfpp:system " + Project.name + ".stack_frame prepend value {}");
                Project.logger.debug("Find entrance function:" + f.tag + " " + f.name);
            }
        }
        if(!hasEntrance){
            Project.logger.warn("No valid entrance function in Project " + Project.name);
            Project.warningCount ++;
        }
        logger.info("Complete compiling project " + root.getName() + " with [" + errorCount + "] error and [" + warningCount + "] warning");
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
}
/*
 *                    _ooOoo_
 *                   o8888888o
 *                   88" . "88
 *                   (| -_- |)
 *                    O\ = /O
 *                ____/`---'\____
 *              .   ' \\| |// `.
 *               / \\||| : |||// \
 *             / _||||| -:- |||||- \
 *               | | \\\ - /// | |
 *             | \_| ''\---/'' | |
 *              \ .-\__ `-` ___/-. /
 *           ___`. .' /--.--\ `. . __
 *        ."" '< `.___\_<|>_/___.' >'"".
 *       | | : `- \`.;`\ _ /`;.`/ - ` : | |
 *         \ \ `-. \_ __\ /__ _/ .-` / /
 * ======`-.____`-.___\_____/___.-`____.-'======
 *                    `=---='
 *
 * .............................................
 *          佛祖保佑             永无BUG
 */
