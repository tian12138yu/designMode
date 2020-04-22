package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author tjy
 * @Date 2020/4/18 16:24
 */


/**
 * 读取文件
 */
public class FileReader {
    public String read(String path){
        FileInputStream fis=null;
        try {
            fis=new FileInputStream(path);
            byte[]b=new byte[1024];
            int len=0;
            StringBuffer sb=new StringBuffer();
            while((len=fis.read(b))!=-1){
                sb.append(new String(b,0,len));
            }
            return sb.toString();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return "";
    }
}
