package com.qiaojie.systemVersion;

import com.qiaojie.File.VideoFile;

/**
 * @Author tjy
 * @Date 2020/4/15 19:46
 */

/**
 * 操作系统抽象类
 */
public abstract class OpenratingSystemVersion {
    protected VideoFile vf;

    public void setVideoFile(VideoFile vf){
        this.vf=vf;
    }

    public abstract void play(String fileName);
}
