package com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior;

/**
 * <p>会游泳的子类来实现游泳的行为</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 13:47 2019/12/6
 */
public class CanSwim implements ISwimBehavior {
    @Override
    public String swimming() {
        return "我会游泳！";
    }
}
