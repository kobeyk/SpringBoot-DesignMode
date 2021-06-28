package com.appleyk.DMA3_单例模式.DM3;

/**
 * <p>DCL（双重检查锁）单例模式 -- 线程安全，只在第一次创建实例的时候加锁</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:12 2018-11-6
 * @version v0.1.1
 */
public class Singleton5 {

    // 私有构造器，防止外部new实例
    private Singleton5(){}

    // 加volatile，防止指令重排序
    private static volatile Singleton5 instance = null;

    /**
     * 区别于Singleton2,注意synchronized关键字【同步块】的位置
     * @return
     */
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class){
                if(instance == null){
                    instance = new Singleton5();
                }
                return instance;
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("你好，我是单例模式五！");
    }

}
