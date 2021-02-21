package com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike;

/**
 * <p>一挡</p>
 *
 * @author appleyk
 * @version V.1.0.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 2019/12/6 10:18 PM
 */
public class FirstGear extends AGearState {

    public FirstGear(Bike bike){
        super(bike);
    }

    @Override
    public void gearUp() {
        System.out.println("一档提升到二挡，速度中");
        bike.setGearState(new SecondGear(bike));
    }

    @Override
    public void gearDown() {
        System.out.println("当前已经是最低挡，不能再降了!，速度低");
    }
}
