package com.appleyk.DMB12_享元模式;

import com.appleyk.DMB12_享元模式.DM12.DbDriverFactory;
import com.appleyk.DMB12_享元模式.DM12.MyDbDriver;

/**
 * <p>享元模式测试</p>
 *
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
 * <p>主要解决</p>
 * 在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，
 * 如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
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
