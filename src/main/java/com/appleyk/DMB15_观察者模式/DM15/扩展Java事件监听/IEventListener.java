package com.appleyk.DMB15_观察者模式.DM15.扩展Java事件监听;

import java.util.EventListener;

/**
 * <p>事件监听器接口</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 11:56 2021/2/21
 */
public interface IEventListener<T> extends EventListener {

    // 持有一个事件对象的响应（即事件发生时，会有相应的listener执行这个方法，并对事件对象做一些业务处理）
    void eventChanged(T event);
}
