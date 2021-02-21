package com.appleyk.DMB15_观察者模式.DM15.Spring事务监听.listener;

import com.appleyk.DMB15_观察者模式.DM15.Spring事务监听.event.TestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * <p>自定义测试事件监听器：通过再事件处理方法上加@EventListener的方式实现</p>
 * 注：这种方式会优先被执行
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 13:00 2021/2/21
 */
@Component
public class TestEventListener2 {

    private static final String name = "TestEventListener2";

    // 主要通过EventListenerMethodProcessor类的processBean方法,对加了@EventListener的方法进行ApplicationListener实例转换
    @EventListener
    public void handler(TestEvent event){
        System.out.println("事件名称:【"+event.getName()+"】触发了，来自监听器："+name);
    }

    public String name(){return name;}
}
