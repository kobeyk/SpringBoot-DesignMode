package com.appleyk.DMB20_状态模式.DM20.自行车加速减速;

import com.appleyk.DMB20_状态模式.DM20.自行车加速减速.bike.Bike;

/**
 * <p></p>
 *
 * @author appleyk
 * @version V.1.0.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 2019/12/6 10:48 PM
 */
public class BikeStateTest {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.gearDown();
        bike.gearUp();
        bike.gearUp();
        bike.gearUp();
        bike.gearDown();
        bike.gearDown();
    }

    /**
     * 通过改变自行车内部档位的属性状态，来改变自行车的行为
     */

}
