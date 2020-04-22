package com.study.logfactory;

import com.study.log.DatabaseLog;
import com.study.log.Log;

/**
 * @Author tjy
 * @Date 2020/4/10 20:05
 */

/**
 * databaselog的工厂类，createLog方法返回一个databaselog对象。
 */
public class DatabaseLogFactory implements LogFactory {
    private DatabaseLog databaseLog;
    @Override
    public Log createLog() {
        databaseLog=new DatabaseLog();
        return databaseLog;
    }
}
