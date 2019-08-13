package com.appleyk.DMB15_观察者模式.DM15.标准简易版;

/**
 * <p>通知接口，主要干的事情，就是添加、移除观察者、以及通知所有观察者，我XXX干了什么</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public interface INotify {

    /**
     * <p>添加一个观察者</p>
     * @param observer 被添加的观察者对象
     */
    void add(IObserver observer);

    /**
     * <p>移除一个观察者</p>
     * @param observer 被移除的观察者对象
     */
    void remove(IObserver observer);

    /**
     * <p>通知所有的观察者，可以理解为，只要在监控内的对象，都通知</p>
     */
    void notifyObservers();

    /**
     * <p>扩展方法，可以交给主体类来实现，比如订阅系统中的源头</p>
     */
    void extend();

}
