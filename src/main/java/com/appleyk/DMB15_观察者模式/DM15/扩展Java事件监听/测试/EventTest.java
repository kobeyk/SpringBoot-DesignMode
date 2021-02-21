package com.appleyk.DMB15_观察者模式.DM15.扩展Java事件监听.测试;

import com.appleyk.DMB15_观察者模式.DM15.扩展Java事件监听.MyEventSource;
import com.appleyk.DMB15_观察者模式.DM15.扩展Java事件监听.MyListener;

public class EventTest {
    public static void main(String[] args) {
        MyEventSource source  = new MyEventSource();
        source.addListener(new MyListener());
        source.setVal(1);
        source.setVal(2);
        source.setVal(3);
    }
}
