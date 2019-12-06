package com.appleyk.DMA2_抽象工厂.DM2;

/**
 * <p>键盘接口 -- 生产键盘 </p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:25 2018-11-6
 * @version V.0.1.1
 */
public interface ProduceKeyBord {
    /**
     * 约定键盘生产的规格数据
     * @param name  名称
     * @param color 颜色
     */
    public void produceKeyBord(String name,String color);
}
