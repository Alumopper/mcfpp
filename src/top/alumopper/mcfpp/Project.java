package top.alumopper.mcfpp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 * 一个工程
 */
public class Project {
    public static Logger logger = Logger.getLogger("qwq");
    static {
        PropertyConfigurator.configure("log4j.properties");
    }

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
                for (int i = 0; i < filesJson.size(); i++) {
                    files.add(filesJson.getString(i));
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
        //工程文件编译
        for (String file : files) {
            logger.debug("Compiling mcfpp code in \"" + file + "\"");
            try{
                McfppCodeReader reader = new McfppCodeReader(file);
            }catch (Exception ignored){}
        }
    }
}
