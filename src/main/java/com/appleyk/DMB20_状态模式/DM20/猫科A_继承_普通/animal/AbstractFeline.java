package com.appleyk.DMB20_状态模式.DM20.猫科A_继承_普通.animal;

/**
 * <p>抽象一个猫科动物的类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date created on 11:13 2019/12/6
 * @version V.0.1.1
 */
public abstract class AbstractFeline {

    /**
     * 假设所有猫科动物都会爬树（你觉得老虎、狮子会吗？）
     */
    public void climbing(){
        System.out.println("我是【"+getName()+"】,我会爬树");
    }

    /**
     * 假设所有猫科动物都会爬游泳（你觉得猫对游泳感兴趣吗？）
     */
    public void swimming(){
        System.out.println("我是【"+getName()+"】,我会游泳");
    }

    public abstract String getName();

}
