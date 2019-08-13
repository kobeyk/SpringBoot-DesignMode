package com.appleyk.DMB15_观察者模式.DM15.标准简易版;

/**
 * <p>自定义子类，继承抽象主类，只需要干一件事情即可，通知所有观察者之前，先...</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class MySubject extends AbstractSubject{

    @Override
    public void extend() {
        System.out.println("大事不妙，有敌情！");
        notifyObservers();
    }
}
