package com.appleyk.DMA10_桥接模式.DM10.database;

/**
 * <p>Oracle数据库驱动类</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 4:38 2018-11-12
 * @Version V.1.0.1
 */
public class OracleDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("oracle驱动连接数据库");
    }
}
