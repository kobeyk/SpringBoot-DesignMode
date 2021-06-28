package com.appleyk.DMB15_观察者模式.DM15.RSS消息订阅;

/**
 * <p>消息订阅者操作接口</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 */
public interface IRsserOperate {

    /**
     * <p>增加一个订阅者</p>
     *
     * @param rss 被增加的订阅者
     */
    void add(IRss rss);

    /**
     * <p>移除一个订阅者</p>
     *
     * @param rss 被移除订阅者
     */
    void del(IRss rss);

    /**
     * <p>根据订阅者的ID移除一个订阅者</p>
     *
     * @param rssID 被移除的订阅者的ID
     */
    void remove(Long rssID);

    /**
     * <p>通知所有订阅者，订阅的内容是什么</p>
     */
    void notifyRssers(String content);

    /**
     * <p>发布消息</p>
     */
    void publish();

}
