package com.appleyk.DMA10_桥接模式.DM10.database;

/**
 * <p>驱动管理器 == 实现不同驱动设备之间的数据库连接</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 4:46 2018-11-12
 */
public class DriverManager extends AbstractBridge {
    @Override
    public void connect() {
        getDriver().connect();
    }
}
