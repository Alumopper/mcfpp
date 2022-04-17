package top.alumopper.mcfpp;

import java.io.*;

/**
 * 读取文件
 */
public class McfppcodeReader {
    
    private BufferedReader reader;  //读取文件

    public McfppcodeReader(String path) throws IOException{
        reader = new BufferedReader(new FileReader(path));
    }

    public McfppcodeReader(Reader r){
        reader = new BufferedReader(r);
    }

    public Token readToken() throws IOException{
        //获取一个token
        /*
        class{
            func{

            }
        }

        func{

        }
        
        dosomething;

        */
        String text = "";
        short isMuti = 0; //是否是复合语句
        while(true){
            char c = (char)reader.read();
            if(c == '/'){
                char c2 = (char)reader.read();
                if(c2 == '/'){
                    reader.readLine();
                    continue;
                }
            }
            if(c == '\n') continue;
            if(c == '{') isMuti++;
            if(c == '}') {
                isMuti--;
                if(isMuti == 0){
                    //复合语句读取完毕
                    text += c;
                    break;
                }
            }
            if(c == ';' && isMuti == 0) break;
            text += c;
        }
        return new Token(text);
    }
}
