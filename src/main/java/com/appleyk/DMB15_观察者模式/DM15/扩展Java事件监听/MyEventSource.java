package com.appleyk.DMB15_观察者模式.DM15.扩展Java事件监听;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *     事件源，即事件从哪冒出来的，比如button按钮的点击事件，其事件源就是button按钮
 *     事件源一定要包含事件和事件对应的监听器，支持监听器的add和事件发布操作
 *     也就是，要想事件发生了，能被监正确的监听到，首先得保证有事件对象，其次事件得由事件源发布出去
 *     （事件不发布，你让监听者（消费者）怎么知道事件发生了！！！！！！）
 * </p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 11:50 2021/2/21
 */
public class MyEventSource {

    // 为了简单起见，直接内置一个事件
    private MyEvent event;
    private List<IEventListener> listeners;

    public MyEventSource() {
        event = new MyEvent(this,1);
        listeners = Collections.synchronizedList(new ArrayList<>());;
    }

    // 添加事件监听
    public void addListener(IEventListener listener){
        this.listeners.add(listener);
    }

    public void setVal(int val){
        event.setVal(val);
        publish();
    }

    // 发布事件
    protected void publish(){
        for (IEventListener listener : listeners) {
            listener.eventChanged(event);
        }
    }
}
