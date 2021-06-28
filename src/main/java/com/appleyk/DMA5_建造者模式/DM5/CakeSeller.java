package com.appleyk.DMA5_建造者模式.DM5;

/**
 * <p>蛋糕销售者 == 告诉蛋糕师，货架上没蛋糕了，赶紧给我做一个出来，客户等着要呢</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 2:02 2018-11-9
 */
public class CakeSeller {

    public CakeSeller() {
    }

    public Cake sell(ICakeBuilder cakeBuilder) {
        cakeBuilder.knead();
        cakeBuilder.ferment();
        cakeBuilder.bake(30);
        return cakeBuilder.getCake();
    }

}
