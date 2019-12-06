package com.appleyk.DMA10_桥接模式.DM10.paint.shape;

/**
 * <p>圆形</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:09 2018-11-19
 * @version V.0.1.1
 */
public class Circle extends AbstractShape {
    @Override
    public void draw() {
        getColor().painting("圆形");
    }

}
