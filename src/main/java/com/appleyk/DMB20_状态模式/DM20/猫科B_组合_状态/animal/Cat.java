package com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.animal;

import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior.CanClimb;
import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior.CanNotSwim;
import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior.ISwimBehavior;

/**
 * <p>家养的猫</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 11:27 2019/12/6
 */
public class Cat extends AbstractFeline {

    /**
     * 默认会爬树，不会游泳
     */
    public Cat() {
        this.climbBehavior = new CanClimb();
        this.swimBehavior = new CanNotSwim();
    }

    /**
     * 猫会不会游泳，取决于外界
     **/
    public Cat(ISwimBehavior swim) {
        this.swimBehavior = swim;
        this.climbBehavior = new CanClimb();
    }

    @Override
    public String getName() {
        return "黑猫警长";
    }
}
