package com.appleyk.DMA10_桥接模式.DM10.paint.color;

/**
 * <p>白色</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:22 2018-11-19
 * @version V.0.1.1
 */
public class White implements Color{
    @Override
    public void painting(String shape) {
        System.out.println("绘制白色的"+shape);
    }
}
