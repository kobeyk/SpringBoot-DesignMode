package com.appleyk.DMB15_观察者模式.DM15.扩展Java事件监听;

/**
 * <p>自定义事件监听实现类</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 12:03 2021/2/21
 */
public class MyListener implements IEventListener<MyEvent>{

    @Override
    public void eventChanged(MyEvent event) {
        System.out.println("调用了eventChanged方法，event = "+event+",val = "+event.getVal());
    }
}
