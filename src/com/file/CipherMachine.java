package com.file;

/**
 * @Author tjy
 * @Date 2020/4/18 16:26
 */

/**
 * 文件加密类
 */
public class CipherMachine {
    public String Encrypt(String str){
        char[]arr=str.toCharArray();
        StringBuffer sb=new StringBuffer();
        for (char c: arr) {
            sb.append(c+1);
        }
        return sb.toString();
    }
}