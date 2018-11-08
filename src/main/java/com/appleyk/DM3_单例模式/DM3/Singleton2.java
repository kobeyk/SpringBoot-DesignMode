package com.appleyk.DM3_单例模式.DM3;

/**
 * <p>单例模式 -- 线程安全，对当前单例对象上锁</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:12 2018-11-6
 * @Version V.1.0.1
 */
public class Singleton2 {

    // 私有构造器，防止外部new实例
    private Singleton2(){}

    private static Singleton2 instance = null;

    /**
     * 虽然线程安全，但是每次调用getInstance获得实例的时候，都会对当前的对象进行加锁
     * 注意，是每一次，这样的话多线程环境下性能会有所下降，但是我们知道单例模式的实例是全局只创建一次的
     * 因此，这个锁不应该在每次获取实例的时候加锁，而应该加在第一次创建对象上
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void show(){
        System.out.println("你好，我是单例模式二！");
    }


}
