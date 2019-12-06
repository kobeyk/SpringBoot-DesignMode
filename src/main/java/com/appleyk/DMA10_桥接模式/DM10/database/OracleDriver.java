package com.appleyk.DMA10_桥接模式.DM10.database;

/**
 * <p>Oracle数据库驱动类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 4:38 2018-11-12
 * @version V.0.1.1
 */
public class OracleDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("oracle驱动连接数据库");
    }
}
