package com.appleyk.DMA10_桥接模式.DM10.database;

/**
 * <p>驱动管理器 == 实现不同驱动设备之间的数据库连接</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 4:46 2018-11-12
 * @Version V.1.0.1
 */
public class DriverManager extends AbstractBridge {
    @Override
    public void connect() {
        getDriver().connect();
    }
}
