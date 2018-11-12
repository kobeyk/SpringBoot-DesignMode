package com.appleyk.DMA5_建造者模式.DM5;

/**
 * <p>蛋糕销售者 == 告诉蛋糕师，货架上没蛋糕了，赶紧给我做一个出来，客户等着要呢</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 2:02 2018-11-9
 * @Version V.1.0.1
 */
public class CakeSeller {

    public  CakeSeller(){

    }

    public  Cake  sell(CakeBuilder cakeBuilder){
        cakeBuilder.knead();
        cakeBuilder.ferment();
        cakeBuilder.bake(30);
        return  cakeBuilder.getCake();
    }

}
