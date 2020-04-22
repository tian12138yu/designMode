package com.study.log;

/**
 * @Author tjy
 * @Date 2020/4/10 20:07
 */

/**
 * DatabaseLog类的writeLog方法返回一个DatabaseLog的实例对象。
 */
public class DatabaseLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("DatabaseLog开始记录。。。");
    }
}
