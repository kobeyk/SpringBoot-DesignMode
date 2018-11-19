package com.appleyk.DMA10_桥接模式.DM10.paint.color;

/**
 * <p>红色</p>
 *
 * @Author Appleyk
 * @Title 苏州中科蓝迪公司所有(c)2016-2021
 * @Date Created on 下午 1:23 2018-11-19
 * @Version V.1.0.1
 */
public class Red implements Color{
    @Override
    public void painting(String shape) {
        System.out.println("绘制红色的"+shape);
    }
}
