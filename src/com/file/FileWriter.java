package com.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author tjy
 * @Date 2020/4/18 16:25
 */


/***
 * 将文件写到指定位置
 */
public class FileWriter {
    public void write(String content,String path) {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(path);
            fos.write(content.getBytes());
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
