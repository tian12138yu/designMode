package com.file;

/**
 * @Author tjy
 * @Date 2020/4/18 16:26
 */

/**.
 * 功能整合，调用文件读，加密，写出的方法。提供方法给顾客使用。
 */
public class EncryptFacade {
    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;
    public EncryptFacade(){
        fileReader=new FileReader();
        cipherMachine=new CipherMachine();
        fileWriter=new FileWriter();
    }
    public void FileEncrypt(String source,String target){
        String str=fileReader.read(source);
        String enStr=cipherMachine.Encrypt(str);
        fileWriter.write(enStr,target);
        System.out.println("加密成功！");
    }
}