package com.study.log;

/**
 * @Author tjy
 * @Date 2020/4/10 20:06
 */

/**
 * FileLog类的writeLog方法返回一个FileLog的实例对象。
 */
public class FileLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("FileLog开始记录。。。");
    }
}
