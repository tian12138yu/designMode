package com.qiaojie.File;

/**
 * @Author tjy
 * @Date 2020/4/15 19:52
 */


/**
 * RMVB实现类
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String osType, String fileName) {
        System.out.println("在"+osType+"上运行名字为"+fileName+"Rmvb类型文件");
    }
}
