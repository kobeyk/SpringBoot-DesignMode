package com.appleyk.DMB15_观察者模式.DM15.Spring事件监听.event;

import org.springframework.context.ApplicationEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>定义一个测试事件，继承Spring封装的ApplicationEvent类</p>
 *
 * 这里需要注意一下：基于Spring事件进行扩展，其事件源即Spring IOC容器 也称Spring上下文
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 12:20 2021/2/21
 */
public class TestEvent extends ApplicationEvent {

    private String name;

    public TestEvent(Object source,String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 打印当前触发事件的时间
    public void printDate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        System.out.println("系统当前时间："+df.format(new Date()));
    }

}
