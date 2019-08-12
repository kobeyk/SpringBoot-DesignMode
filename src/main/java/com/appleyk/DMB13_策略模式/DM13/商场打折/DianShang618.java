package com.appleyk.DMB13_策略模式.DM13.商场打折;

/**
 * <p>电商节 - 6.18 -- 满618元减99，满1000元打8.5折</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class DianShang618 implements ICalculatePrice{

    @Override
    public double getDiscountedPrice(double totalPrice) {

        if(totalPrice >= 618 ){
            return totalPrice - 99 ;
        }

        if(totalPrice >= 1000){
            return totalPrice * 0.85;
        }

        return totalPrice;
    }

}
