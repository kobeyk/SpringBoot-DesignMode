package com.appleyk.DMB15_观察者模式.DM15.Spring事件监听.run;

import com.appleyk.DMB15_观察者模式.DM15.Spring事件监听.config.SConfig;
import com.appleyk.DMB15_观察者模式.DM15.Spring事件监听.event.TestEvent;
import com.appleyk.DMB15_观察者模式.DM15.Spring事件监听.listener.TestEventListener1;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p></p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 12:49 2021/2/21
 */
public class RunTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SConfig.class);
        // 添加监听
        context.addApplicationListener(new TestEventListener1());
        // 发布事件
        context.publishEvent(new TestEvent(new Object(),"测试事件"));
    }
}
