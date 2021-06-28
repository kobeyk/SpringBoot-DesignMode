package com.appleyk.DMA2_抽象工厂.DM2;

/**
 * <p>鼠标接口 -- 生产鼠标</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:28 2018-11-6
 * @version v0.1.1
 */
public interface IProduceMouse {
     /**
     * 约定鼠标生产的规格数据
     * @param name 名称
     * @param type 类型
     */
     void produceMouse(String name,String type);
}
