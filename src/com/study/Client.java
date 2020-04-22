package com.study;

import com.study.log.Log;
import com.study.logfactory.DatabaseLogFactory;
import com.study.logfactory.FileLogFactory;

/**
 * @Author tjy
 * @Date 2020/4/10 19:54
 */

/**
 * 模拟用户调用Log进行日志记录。
 */
public class Client {

    public static void main(String[] args) {
        DatabaseLogFactory databaseLogFactory = new DatabaseLogFactory();
        Log log = databaseLogFactory.createLog();
        log.writeLog();
//        FileLogFactory fileLogFactory = new FileLogFactory();
//        Log log = fileLogFactory.createLog();
//        log.writeLog();
   }

}
