package com.appleyk.DMB13_策略模式.DM13.商场打折;

/**
 * <p>定义价格计算策略接口，为每一个策略类提供统一的计算折扣价钱的方法</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public interface ICalculatePrice {

    /**
     * <p>根据商品的实际总价计算得到商品折后的价钱</p>
     * @param totalPrice 实际商品总价
     * @return 折后价
     */
    double getDiscountedPrice(double totalPrice);

}
