package top.alumopper.mcfpp;

import org.json.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * 一个工程
 */
public class Project {
    public static Logger logger = Logger.getLogger("mcfpp");

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
            BufferedReader reader = new BufferedReader(new FileReader(path));
            StringBuilder json = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null){
                json.append(line);
            }
            JSONObject jsonObject = new JSONObject(json.toString());
            files = new ArrayList<>();
            JSONArray filesJson = jsonObject.getJSONArray("files");
            for (int i = 0; i < filesJson.length(); i++) {
                files.add(filesJson.getString(i));
            }
            version = jsonObject.getString("version");
            includes = new ArrayList<>();
            JSONArray includesJson = jsonObject.getJSONArray("includes");
            for (int i = 0; i < includesJson.length(); i++) {
                includes.add(includesJson.getString(i));
            }
        }catch (Exception ignored){}
        //工程文件编译
        for (String file : files) {
            try{
                McfppCodeReader reader = new McfppCodeReader(file);
            }catch (Exception ignored){}
        }
    }
}
