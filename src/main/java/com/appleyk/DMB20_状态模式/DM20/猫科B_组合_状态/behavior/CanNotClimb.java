package com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior;

/**
 * <p>不会爬树的子类来实现爬树的行为</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 13:47 2019/12/6
 */
public class CanNotClimb implements IClimbBehavior{
    @Override
    public String climbing() {
        return "我不会爬树！" ;
    }
}
