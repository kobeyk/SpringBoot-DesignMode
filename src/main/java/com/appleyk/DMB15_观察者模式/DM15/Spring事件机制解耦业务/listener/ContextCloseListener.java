package com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * <p>Spring上下文Close监听器</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 14:48 2021/2/21
 */
@Component
public class ContextCloseListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("========== Spring IOC 容器成功销毁，程序退出！ ==========");
    }
}
