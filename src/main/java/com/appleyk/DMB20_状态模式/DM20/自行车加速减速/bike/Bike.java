package com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike;

import com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike.AGearState;

/**
 * <p>自行车</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 14:55 2019/12/6
 */
public class Bike {

    private AGearState gearState;

    public Bike() {
        gearState = new FirstGear(this);
    }

    public AGearState getGearState() {
        return gearState;
    }

    public void setGearState(AGearState gearState) {
        this.gearState = gearState;
    }

    public void gearUp() {
        gearState.gearUp();
    }

    public void gearDown() {
        gearState.gearDown();
    }
}
