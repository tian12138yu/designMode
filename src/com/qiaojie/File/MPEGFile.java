package com.qiaojie.File;

/**
 * @Author tjy
 * @Date 2020/4/15 19:51
 */


/**
 * MPEG格式实现类
 */
public class MPEGFile implements VideoFile {
    @Override
    public void decode(String osType, String fileName) {
        System.out.println("在"+osType+"上运行名字为"+fileName+"MPEG类型文件");
    }
}
