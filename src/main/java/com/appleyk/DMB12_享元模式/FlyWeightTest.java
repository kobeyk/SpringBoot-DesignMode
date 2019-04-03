package com.appleyk.DMB12_享元模式;

import com.appleyk.DMB12_享元模式.DM12.DbDriverFactory;
import com.appleyk.DMB12_享元模式.DM12.MyDbDriver;

/**
 * <p>享元模式测试</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:23 2018-11-21
 * @Version V.1.0.1
 */
public class FlyWeightTest {

    public static void main(String[] args) {
        DbDriverFactory factory = new DbDriverFactory();
        // 工厂创建或取我们所需要的
        MyDbDriver driver1 = factory.getDbDriver("mysql");
        MyDbDriver driver2 = factory.getDbDriver("mongodb");
        MyDbDriver driver3 = factory.getDbDriver("mysql");
        MyDbDriver driver4 = factory.getDbDriver("postgresql");
        MyDbDriver driver5 = factory.getDbDriver("oracle");
        MyDbDriver driver6 = factory.getDbDriver("postgresql");
        MyDbDriver driver7 = factory.getDbDriver("mysql");
        System.out.println("================================");
        factory.showConns();
        System.out.println("================================");
        System.out.println("工厂实例集大小："+factory.size());
    }


}
