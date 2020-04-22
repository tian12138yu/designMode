package com.qiaojie.systemVersion;

/**
 * @Author tjy
 * @Date 2020/4/15 19:53
 */


/**
 * Windows实现类
 */
public class WindowsVwesion extends OpenratingSystemVersion {
    @Override
    public void play(String fileName) {
        String osType="windows";
        this.vf.decode(osType,fileName);
    }
}
