package com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.animal;

import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior.IClimbBehavior;
import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior.ISwimBehavior;

/**
 * <p>抽象一个猫科动物的类</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 13:43 2019/12/6
 */
public abstract class AbstractFeline {

    /**
     * 爬树的行为
     */
    protected IClimbBehavior climbBehavior;
    /**
     * 游泳的行为
     */
    protected ISwimBehavior swimBehavior;

    /**
     * 假设所有猫科动物都会爬树（你觉得老虎、狮子会吗？）
     */
    public void climbing() {
        System.out.println("我是【" + getName() + "】," + climbBehavior.climbing());
    }

    /**
     * 假设所有猫科动物都会爬游泳（你觉得猫对游泳感兴趣吗？）
     */
    public void swimming() {
        System.out.println("我是【" + getName() + "】," + swimBehavior.swimming());
    }

    public void setClimbBehavior(IClimbBehavior climbBehavior) {
        this.climbBehavior = climbBehavior;
    }

    public void setSwimBehavior(ISwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public abstract String getName();

}
