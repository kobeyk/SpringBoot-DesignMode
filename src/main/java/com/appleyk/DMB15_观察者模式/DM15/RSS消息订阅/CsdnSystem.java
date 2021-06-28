package com.appleyk.DMB15_观察者模式.DM15.RSS消息订阅;

/**
 * <p>CSDN博客系统，可以理解为目标对象，继承订阅抽象类，实现消息的发布</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 */
public class CsdnSystem extends AbstractSubscription {

    /**
     * 订阅的消息内容
     */
    private String content;

    public CsdnSystem() {
    }

    public CsdnSystem(String content) {
        this.content = content;
    }

    /**
     * <p>一旦调用该方法，所有依赖于csdn系统的消息订阅者都将收到变更的消息</p>
     */
    @Override
    public void publish() {
        System.out.println("博主通知：广大的童鞋们，如果对我写的文章感兴趣的话，请伸出你的大拇指，给个赞吧！");
        notifyRssers(content);
    }

}
