package com.appleyk.DMA2_抽象工厂.Factory;

import com.appleyk.DMA2_抽象工厂.DM2.AComputerFactory;
import com.appleyk.DMA2_抽象工厂.DM2.ProduceKeyBord;
import com.appleyk.DMA2_抽象工厂.DM2.ProduceMouse;
import com.appleyk.DMA2_抽象工厂.KeyBoard.LeiBoKeyBord;
import com.appleyk.DMA2_抽象工厂.Mouse.LeiBoMouse;

/**
 * <p>联想电脑生产商 == 电脑型号01【固定键盘和鼠标生产商】</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:47 2018-11-6
 * @Version V.1.0.1
 */
public class LianXiang01Factory implements AComputerFactory {


    @Override
    public ProduceKeyBord createKeyBord() {
        // 使用雷柏的键盘
        return new LeiBoKeyBord();
    }

    @Override
    public ProduceMouse createMouse() {
        // 使用雷柏的鼠标
        return new LeiBoMouse();
    }
}
