package com.appleyk.DMB15_观察者模式.DM15.Spring事件监听.listener;

import com.appleyk.DMB15_观察者模式.DM15.Spring事件监听.event.TestEvent;
import org.springframework.context.ApplicationListener;

/**
 * <p>自定义测试事件监听器：通过显示的实现Spring框架中封装的ApplicationListener接口来完成事件监听</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 12:22 2021/2/21
 */
public class TestEventListener1 implements ApplicationListener<TestEvent> {

    private static final String name = "TestEventListener1";

    // 持有事件event的响应
    @Override
    public void onApplicationEvent(TestEvent event) {
        System.out.println("事件名称:【"+event.getName()+"】触发了，来自监听器："+name);
    }
}
