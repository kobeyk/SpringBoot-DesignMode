package com.appleyk.DMB15_观察者模式.DM15.RSS消息订阅;

/**
 * <p>消息订阅消费者</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class RssUser implements IRss {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名称
     */
    private String name;

    public RssUser(Long id , String name){
        this.id = id ;
        this.name = name ;
    }

    @Override
    public void rss(String content) {
        System.out.println("尊敬的用户（ id = "+this.id+",name = "+this.name+"),你搜到了一条订阅消息："+content);
    }

    public Long getId() {
        return id;
    }

}
