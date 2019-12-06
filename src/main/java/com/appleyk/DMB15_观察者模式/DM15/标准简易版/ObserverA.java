package com.appleyk.DMB15_观察者模式.DM15.标准简易版;

/**
 * <p>观察者A</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class ObserverA implements IObserver{

    @Override
    public void discover() {
        System.out.println("观察者A：不好，发现敌情，敌军还有三秒抵达战场！");
    }
}
