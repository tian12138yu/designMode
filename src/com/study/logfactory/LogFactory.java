package com.study.logfactory;

import com.study.log.Log;

/**
 * @Author tjy
 * @Date 2020/4/10 20:00
 */

/**
 * Log的工厂接口，可以创建一个Log，所有的LogFactroy实现该接口。
 */
public interface LogFactory {
    Log createLog();
}
