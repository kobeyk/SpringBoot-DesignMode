package com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.model;

import org.springframework.context.ApplicationEvent;

/**
 * <p>发送邮件事件</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 13:37 2021/2/21
 */
public class TSendEmailEvent extends ApplicationEvent {

    /**邮件*/
    private final String email;

    /**内容*/
    private final String content;

    /**
     * @param source 事件源：该事件在哪发生的
     */
    public TSendEmailEvent(Object source,String email, String content) {
        super(source);
        this.email = email;
        this.content = content;
    }

    public void sendEmail(){
        try{
            // 由于网络原因，这里模拟发邮件会持续3s
            Thread.sleep(3000);
            System.out.printf("给用户<%s>发送内容为<%s>的邮件成功！\n",email,content);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
