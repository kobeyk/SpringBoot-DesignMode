package com.appleyk.DMA2_抽象工厂.KeyBoard;

import com.appleyk.DMA2_抽象工厂.DM2.ProduceKeyBord;

/**
 * <p>雷柏（Rapoo）键盘生产商</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:36 2018-11-6
 * @Version V.1.0.1
 */
public class LeiBoKeyBord implements ProduceKeyBord {
    @Override
    public void produceKeyBord(String name, String color) {
        System.out.println("雷柏键盘 -- "+name+","+color);
    }
}
