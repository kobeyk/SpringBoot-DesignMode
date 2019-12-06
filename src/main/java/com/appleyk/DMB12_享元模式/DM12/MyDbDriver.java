package com.appleyk.DMB12_享元模式.DM12;

/**
 * <p>自定义数据源驱动类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:23 2018-11-21
 * @version V.0.1.1
 */
public class MyDbDriver extends AbstractFlyWeight{

    /**
     * 数据源驱动名称 == （对于具体的某个数据源驱动，其参数是固定的，因为无需重复new对象）
     */
    private String driverName;

    public MyDbDriver(String driverName){
        this.driverName = driverName;
    }

    @Override
    public void connection() {
        System.out.println(driverName+" -- 连接数据库");
    }
}
