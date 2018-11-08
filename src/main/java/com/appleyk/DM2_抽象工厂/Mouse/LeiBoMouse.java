package com.appleyk.DM2_抽象工厂.Mouse;

import com.appleyk.DM2_抽象工厂.DM2.ProduceMouse;

/**
 * <p>雷柏（Rapoo）鼠标生产商</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:36 2018-11-6
 * @Version V.1.0.1
 */
public class LeiBoMouse implements ProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("雷柏鼠标 -- "+name+","+type);
    }
}
