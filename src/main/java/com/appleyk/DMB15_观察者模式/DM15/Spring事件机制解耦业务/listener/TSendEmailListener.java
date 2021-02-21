package com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.listener;

import com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.model.TSendEmailEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * <p>发送邮件监听器</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 13:38 2021/2/21
 */
@Component
public class TSendEmailListener {

    @Async // 标注异步执行
    @EventListener
    public void handler(TSendEmailEvent event){
        System.out.println("========== 正在给用户发送邮件，请稍等.....==========");
        System.out.println("事件源 = "+event.getSource());
        // 只要TSendEmailEvent发生（发布），这里就会去调用时间的send方法，给用户发送邮件
        event.sendEmail();
    }

}
