package com.appleyk.DMB15_观察者模式;

import com.appleyk.DMB15_观察者模式.DM15.RSS消息订阅.CsdnSystem;
import com.appleyk.DMB15_观察者模式.DM15.RSS消息订阅.RssUser;
import com.appleyk.DMB15_观察者模式.DM15.标准简易版.IObserver;
import com.appleyk.DMB15_观察者模式.DM15.标准简易版.MySubject;
import com.appleyk.DMB15_观察者模式.DM15.标准简易版.ObserverA;
import com.appleyk.DMB15_观察者模式.DM15.标准简易版.ObserverB;

/**
 * <p>观察者模式测试</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class ObserverTest {

    public static void main(String[] args) {

        // 1、抽象的、标准的、简易的通知调用
        notifyTest();
        System.out.println("========================================");
        // 2、免费给csdn打广告，博主也是真爱啊
        rssTest();

    }

    private static void notifyTest(){
        IObserver observerA = new ObserverA();
        IObserver observerB = new ObserverB();
        MySubject subject = new MySubject();
        subject.add(observerA);
        subject.add(observerB);
        subject.extend();
    }

    private static void rssTest(){

        String publishContent = "作者Appleyk , 刚刚发表了一篇博文：《Java 23种设计模式Demo案列大全 ☞ 【持续更新】》";
        CsdnSystem csdnSystem = new CsdnSystem(publishContent);
        csdnSystem.add(new RssUser(10001L,"曹操"));
        csdnSystem.add(new RssUser(10002L,"刘备"));
        csdnSystem.add(new RssUser(10003L,"孙权"));
        csdnSystem.publish();

        System.out.println("=========================此时，曹操退出了群聊");
        csdnSystem.remove(10001L);
        csdnSystem.publish();

    }

    /**
     * 百科如下描述观察者模式：
     * 观察者模式（有时又被称为发布/订阅模式）是软件设计模式的一种。
     * 在此种模式中，一个目标对象管理所有相依于它的观察者对象，并且在它本身的状态改变时主动发出通知。
     * 这通常透过呼叫各观察者所提供的方法来实现。此种模式通常被用来实现事件处理系统。
     *
     * 看了解释，主要记住这句话就行了，又被称为发布/订阅模式
     * 优点如下：
     * （1）主要或目标对象与被观察之间是完全解耦的，因此二者很容易被扩展
     * （2）主对象可以将改变的状态结果通过链条的形式传递给依赖于其的所有被观察者对象，
     *      大大节省了通知的代码量（否则需要人工去一个个通知）
     * 缺点如下：
     *      由于观察者的数量不定，如果数量过大的话，链式的通知方法会严重影响性能！！！
     */
}
