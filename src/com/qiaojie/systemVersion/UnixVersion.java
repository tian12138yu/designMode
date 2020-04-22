package com.qiaojie.systemVersion;

/**
 * @Author tjy
 * @Date 2020/4/15 19:58
 */


/**
 * Unix系统的实现类
 */
public class UnixVersion extends OpenratingSystemVersion
{
    @Override
    public void play(String fileName) {
        String osType = "Unix";
        this.vf.decode(osType,fileName);
    }
}
