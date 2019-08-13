package com.appleyk.DMB15_观察者模式.DM15.标准简易版;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>抽象一个主类，实现通知接口，并保留扩展方法</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public abstract class AbstractSubject implements INotify{

    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.discover();
        }
    }
}
