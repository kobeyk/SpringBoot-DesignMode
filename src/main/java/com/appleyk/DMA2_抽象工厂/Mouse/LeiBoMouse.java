package com.appleyk.DMA2_抽象工厂.Mouse;

import com.appleyk.DMA2_抽象工厂.DM2.ProduceMouse;

/**
 * <p>雷柏（Rapoo）鼠标生产商</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:36 2018-11-6
 * @version V.0.1.1
 */
public class LeiBoMouse implements ProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("雷柏鼠标 -- "+name+","+type);
    }
}
