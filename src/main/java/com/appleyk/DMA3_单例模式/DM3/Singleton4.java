package com.appleyk.DMA3_单例模式.DM3;

/**
 * <p>单例模式 -- 内部静态工厂类提前创建好实例对象</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:12 2018-11-6
 * @version V.0.1.1
 */
public class Singleton4 {

    // 私有构造器，防止外部new实例
    private Singleton4(){}

    private static  class SingletonFactory{
        private static Singleton4 instance = new Singleton4();
    }

    public static  Singleton4 getInstance(){
        return SingletonFactory.instance;
    }

    public void show(){
        System.out.println("你好，我是单例模式四！");
    }


}
