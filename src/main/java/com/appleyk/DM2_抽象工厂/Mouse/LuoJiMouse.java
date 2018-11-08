package com.appleyk.DM2_抽象工厂.Mouse;

import com.appleyk.DM2_抽象工厂.DM2.ProduceMouse;

/**
 * <p>罗技（G）鼠标生产商</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:39 2018-11-6
 * @Version V.1.0.1
 */
public class LuoJiMouse implements ProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("罗技鼠标 -- "+name+","+type);
    }
}
