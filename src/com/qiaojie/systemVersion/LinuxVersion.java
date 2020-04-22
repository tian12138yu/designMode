package com.qiaojie.systemVersion;

/**
 * @Author tjy
 * @Date 2020/4/15 19:59
 */


/**
 * Linux系统实现类
 */
public class LinuxVersion extends OpenratingSystemVersion{
    @Override
    public void play(String fileName) {
        String osType = "Linux";
        this.vf.decode(osType,fileName);
    }
}
