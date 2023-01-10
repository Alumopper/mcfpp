package top.alumopper.mcfpp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import top.alumopper.mcfpp.reader.McfppFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 一个工程
 */
public class Project {
    public static Logger logger = Logger.getLogger("mcfpp");
    static {
        PropertyConfigurator.configure("log4j.properties");
    }

    /**
     * 工程的根目录
     */
    File root;

    /**
     * 工程包含的所有文件
     */
    ArrayList<String> files;

    /**
     * 工程对应的mc版本
     */
    String version;

    /**
     *  工程包含的所有引用
     */
    ArrayList<String> includes;

    /**
     * 读取工程
     * @param path 工程的json文件的路径
     */
    public Project(String path){
        //工程信息读取
        try{
            logger.debug("Reading project from file \"" + path + "\"");
            BufferedReader reader = new BufferedReader(new FileReader(path));
            this.root = new File(path).getParentFile();
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
            }else {
                for (Object o : filesJson.toArray()) {
                    String s = (String) o;
                    if(s.endsWith("*")){
                        //通配符
                        s = s.substring(0,s.length()-1);
                    }
                    if(s.length() > 2 && s.charAt(1) == ':'){
                        //绝对路径
                        File r = new File(s);
                        logger.info("Finding file in \"" + r.getAbsolutePath() + "\"");
                        getFiles(r, files);
                    }else {
                        //相对路径
                        File r = new File(root.getAbsolutePath() + s);
                        logger.info("Finding file in \"" + r.getAbsolutePath() + "\"");
                        getFiles(r, files);
                    }
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
            e.printStackTrace();
        }
    }

    public void compile(){
        //工程文件编译
        assert files != null;
        for (String file : files) {
            logger.debug("Compiling mcfpp code in \"" + file + "\"");
            try{
                new McfppFileReader(file).analyze();
            }catch (Exception e){
                logger.error("Error while compiling file \"" + file + "\"");
                e.printStackTrace();
            }
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
