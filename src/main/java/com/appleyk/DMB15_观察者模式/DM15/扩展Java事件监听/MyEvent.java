package com.appleyk.DMB15_观察者模式.DM15.扩展Java事件监听;

import java.util.EventObject;

/**
 * <p>自定义事件</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 11:48 2021/2/21
 */
public class MyEvent extends EventObject {

    private int val;

    public MyEvent(Object source,int val) {
        super(source);
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
