package com.appleyk.DMB15_观察者模式.DM15.Spring事件监听.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * <p>Spring上下文完成刷新（配置、加载bean定义、创建bean实例等等）监听器</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 13:05 2021/2/21
 */
@Component
public class ContextFinishedListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // 这个方法里面可以干很多很多事情，比如拿到context，你可以进行下面的操作
        ApplicationContext context = event.getApplicationContext();
        System.out.println("从Spring上下文获取bean，然后调用bean的name ："+context.getBean(TestEventListener2.class).name());
        // 再比如，软件lic的安装，要在spring完成上下文的刷新后进行install
        // Lic的具体案例可以参考我的博文：https://blog.csdn.net/Appleyk/article/details/101530203
        System.out.println("==================== 分割线 ========================");
        System.out.println("Hi man，You can have fun using the Spring Framework");
    }
}
