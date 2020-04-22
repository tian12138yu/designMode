package com.qiaojie;

import com.qiaojie.File.AviFile;
import com.qiaojie.File.MPEGFile;
import com.qiaojie.File.RmvbFile;
import com.qiaojie.File.VideoFile;
import com.qiaojie.systemVersion.LinuxVersion;
import com.qiaojie.systemVersion.OpenratingSystemVersion;
import com.qiaojie.systemVersion.UnixVersion;
import com.qiaojie.systemVersion.WindowsVwesion;

/**
 * @Author tjy
 * @Date 2020/4/15 20:00
 */

/**
 * 控制台
 */
public class Client {
    public static void main(String[] args) {
        OpenratingSystemVersion os;
        VideoFile vf;
//         os = new LinuxVersion();
//         vf = new AviFile();
//         os=new WindowsVwesion();
//         vf=new RmvbFile();
         os=new UnixVersion();
         vf=new MPEGFile();
         os.setVideoFile(vf);
         os.play("aaa");

    }
}
