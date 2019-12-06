package com.appleyk.DMB13_策略模式.DM13.商场打折;

/**
 * <p>价格上下文类</p>
 * <p>对用户暴露计算折后价钱的方法，由用户选择使用具体的打折策略类来计算最终的商品价钱</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class PriceContext {

    private ICalculatePrice price;

    public PriceContext(ICalculatePrice price) {
        this.price = price;
    }

    public double discount(double totalPrice){
        double discountedPrice = price.getDiscountedPrice(totalPrice);
        if(0.0 == discountedPrice){
            System.out.println("恭喜您，您本次消费免单！");
        }
        return discountedPrice;
    }

}
