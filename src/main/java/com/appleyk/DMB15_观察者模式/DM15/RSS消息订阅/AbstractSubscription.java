package com.appleyk.DMB15_观察者模式.DM15.RSS消息订阅;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>抽象一个订阅类，实现rss操作</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public abstract class AbstractSubscription implements IRsserOperate{

    /**
     * 存放订阅了消息的用户
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

    @Override
    public void notifyRssers(String content) {
        for (IRss rss : rsses) {
            rss.rss(content);
        }
    }
}
