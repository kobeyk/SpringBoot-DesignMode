package com.appleyk.DMB15_观察者模式.DM15.标准简易版;

/**
 * <p>观察者A</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class ObserverB implements IObserver{

    @Override
    public void discover() {
        System.out.println("观察者B：不好，发现敌情，敌军还有两秒抵达战场！");
    }
}
