package com.appleyk.DM3_单例模式.DM3;

/**
 * <p>单例模式 -- 线程安全，只在第一次创建实例的时候加锁</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:12 2018-11-6
 * @Version V.1.0.1
 */
public class Singleton3 {

    // 私有构造器，防止外部new实例
    private Singleton3(){}

    private static Singleton3 instance = null;

    /**
     * 区别于Singleton2,注意synchronized关键字【同步块】的位置
     * @return
     */
    public static  Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class){
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("你好，我是单例模式三！");
    }


}
