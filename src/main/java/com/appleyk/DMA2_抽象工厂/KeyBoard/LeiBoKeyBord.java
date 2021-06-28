package com.appleyk.DMA2_抽象工厂.KeyBoard;

import com.appleyk.DMA2_抽象工厂.DM2.IProduceKeyBord;

/**
 * <p>雷柏（Rapoo）键盘生产商</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:36 2018-11-6
 * @version v0.1.1
 */
public class LeiBoKeyBord implements IProduceKeyBord {
    @Override
    public void produceKeyBord(String name, String color) {
        System.out.println("雷柏键盘 -- "+name+","+color);
    }
}
