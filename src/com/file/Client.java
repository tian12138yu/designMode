package com.file;

/**
 * @Author tjy
 * @Date 2020/4/18 16:23
 */


/**
 * 用户客户端，调用提供的方法进行加密。
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade encryptFacade=new EncryptFacade();
        encryptFacade.FileEncrypt("D:\\1.txt","D:\\2.txt");
    }
}











