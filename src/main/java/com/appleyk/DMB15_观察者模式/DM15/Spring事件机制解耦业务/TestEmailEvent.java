package com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务;

import com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.config.EmailConfig;
import com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.model.TUser;
import com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmailEvent {

    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(EmailConfig.class);
        UserService userService = context.getBean(UserService.class);
        TUser user = TUser.builder()
                .userName("Appleyk")
                .password("123456a")
                .nickName("黑曼巴")
                .email("123456@qq.com")
                .build();
        userService.register(user);
        Thread.sleep(5000);
        context.close();
    }

}
