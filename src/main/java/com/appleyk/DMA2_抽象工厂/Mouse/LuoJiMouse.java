package com.appleyk.DMA2_抽象工厂.Mouse;

import com.appleyk.DMA2_抽象工厂.DM2.IProduceMouse;

/**
 * <p>罗技（G）鼠标生产商</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:39 2018-11-6
 * @version v0.1.1
 */
public class LuoJiMouse implements IProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("罗技鼠标 -- "+name+","+type);
    }
}
