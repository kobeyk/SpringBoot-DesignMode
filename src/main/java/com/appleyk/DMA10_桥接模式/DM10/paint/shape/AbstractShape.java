package com.appleyk.DMA10_桥接模式.DM10.paint.shape;

import com.appleyk.DMA10_桥接模式.DM10.paint.color.Color;

/**
 * <p>抽象形状类 -- 聚合与关联Color实现类</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:03 2018-11-19
 */
public abstract class AbstractShape {

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 抽象方法 == 绘制图案
     */
    abstract void draw();
}
