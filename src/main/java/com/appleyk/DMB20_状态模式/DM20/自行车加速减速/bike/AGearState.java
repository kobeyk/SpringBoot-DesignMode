package com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike;

/**
 * <p>档位状态</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 2019/12/6 10:13 PM
 */
public abstract class AGearState {

    protected Bike bike;

    public AGearState(Bike bike) {
        this.bike = bike;
    }

    /**
     * 加档
     */
    public abstract void gearUp();

    /**
     * 减档
     */
    public abstract void gearDown();


}
