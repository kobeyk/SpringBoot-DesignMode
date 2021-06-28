package com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike;

/**
 * <p>二挡</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 2019/12/6 10:18 PM
 */
public class SecondGear extends AGearState {

    public SecondGear(Bike bike) {
        super(bike);
    }

    @Override
    public void gearUp() {
        System.out.println("二挡提升到三挡，速度快");
        bike.setGearState(new ThirdGear(bike));
    }

    @Override
    public void gearDown() {
        System.out.println("二挡降到一挡，速度低");
        bike.setGearState(new FirstGear(bike));
    }
}
