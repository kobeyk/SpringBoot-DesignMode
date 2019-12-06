package com.appleyk.DMA10_桥接模式.DM10.database;

/**
 * <p>PostGreSql数据库驱动类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 4:39 2018-11-12
 * @version V.0.1.1
 */
public class PostgreSqlDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("postgresql驱动连接数据库");
    }
}
