package com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.animal;


import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior.CanNotClimb;
import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior.CanSwim;
import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior.IClimbBehavior;

/**
 * <p>狮子</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 11:37 2019/12/6
 */
public class Lion extends AbstractFeline {

    /**
     * 默认会游泳，不会爬树
     */
    public Lion() {
        setSwimBehavior(new CanSwim());
        setClimbBehavior(new CanNotClimb());
    }

    /**
     * 狮子会不会爬树，取决于外界
     **/
    public Lion(IClimbBehavior climb) {
        this.swimBehavior = new CanSwim();
        this.climbBehavior = climb;
    }

    @Override
    public String getName() {
        return "狮子之王·辛巴";
    }
}
