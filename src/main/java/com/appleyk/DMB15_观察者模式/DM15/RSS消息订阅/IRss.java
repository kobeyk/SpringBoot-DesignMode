package com.appleyk.DMB15_观察者模式.DM15.RSS消息订阅;

/**
 * <p>消息订阅接口，提供一个订阅消息内容的实现</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public interface IRss {

    /**
     * 消息订阅，主要输出订阅的内容
     * @param content 消息内容
     */
    void rss(String content);

}
