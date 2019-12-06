package com.appleyk.DMA3_单例模式.DM3;

/**
 * <p>单例模式 -- 非线程安全</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:12 2018-11-6
 * @version V.0.1.1
 */
public class Singleton1 {

    // 私有构造器，防止外部new实例
    private Singleton1(){}

    private static  Singleton1 instance = null;

    /**
     * 非线程安全，多线程下会有问题【多线程抢资源，谁先抢到呢？会不会出现N个线程拿到的实例不是同一个呢？】
     * @return
     */
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void show(){
        System.out.println("你好，我是单例模式一！");
    }


}
