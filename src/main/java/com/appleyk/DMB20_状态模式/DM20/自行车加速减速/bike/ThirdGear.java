package com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike;

import com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike.AGearState;
import com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike.Bike;
import com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike.SecondGear;

/**
 * <p>三挡</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 2019/12/6 10:18 PM
 */
public class ThirdGear extends AGearState {

    public ThirdGear(Bike bike){
        super(bike);
    }

    @Override
    public void gearUp() {
        System.out.println("已经是最高档了，不能再加了！，速度快");
    }

    @Override
    public void gearDown() {
        System.out.println("三挡降到二挡，速度中");
        bike.setGearState(new SecondGear(bike));
    }
}
