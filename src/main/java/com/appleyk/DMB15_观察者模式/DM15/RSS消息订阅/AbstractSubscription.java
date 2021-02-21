package com.appleyk.DMB15_观察者模式.DM15.RSS消息订阅;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>抽象一个订阅类，实现rss操作</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public abstract class AbstractSubscription implements IRsserOperate{

    /**
     * 存放不同的消息订阅对象（一个消息订阅对象对应一个消息消费者）
     */
    private List<IRss> rsses = new ArrayList<>();

    @Override
    public void add(IRss rss) {
        this.rsses.add(rss);
    }

    @Override
    public void del(IRss rss) {
        this.rsses.remove(rss);
    }

    /**
     * 移除消息订阅方
     * @param rssId 消息订阅消费者ID
     */
    @Override
    public void remove(Long rssId) {
        Iterator<IRss> iterator = rsses.iterator();
        while (iterator.hasNext()){
            RssUser next = (RssUser)iterator.next();
            if(rssId.equals(next.getId())){
                iterator.remove();
                break;
            }
        }
    }

    /**
     * 将消息通知到所有的订阅者
     * @param content 消息内容
     */
    @Override
    public void notifyRssers(String content) {
        for (IRss rss : rsses) {
            // 循环调用
            rss.rss(content);
        }
    }
}
