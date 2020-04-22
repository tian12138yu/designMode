package com.study.logfactory;

import com.study.log.FileLog;
import com.study.log.Log;

/**
 * @Author tjy
 * @Date 2020/4/10 20:05
 */

/**
 * FileLog的工厂类，createLog方法返回一个FileLog对象。
 */
public class FileLogFactory implements LogFactory {
    private FileLog fileLog;
    @Override
    public Log createLog() {
        fileLog=new FileLog();
        return fileLog;
    }
}
