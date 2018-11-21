package com.appleyk.DMA10_桥接模式.DM10.paint.shape;

import com.appleyk.DMA10_桥接模式.DM10.paint.color.Color;

/**
 * <p>抽象形状类 -- 聚合与关联Color实现类</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:03 2018-11-19
 * @Version V.1.0.1
 */
public abstract  class AbstractShape {

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
