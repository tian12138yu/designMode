package com.qiaojie.File;

/**
 * @Author tjy
 * @Date 2020/4/15 19:50
 */


/**
 * WMV实现类
 */
public class WMVFile implements VideoFile {
    @Override
    public void decode(String osType, String fileName) {
        System.out.println("在"+osType+"上运行名字为"+fileName+"WMV类型文件");
    }
}
