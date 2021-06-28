package com.appleyk.DMA2_抽象工厂.Factory;

import com.appleyk.DMA2_抽象工厂.DM2.IComputerFactory;
import com.appleyk.DMA2_抽象工厂.DM2.IProduceKeyBord;
import com.appleyk.DMA2_抽象工厂.DM2.IProduceMouse;
import com.appleyk.DMA2_抽象工厂.KeyBoard.LeiBoKeyBord;
import com.appleyk.DMA2_抽象工厂.Mouse.LuoJiMouse;

/**
 * <p>联想电脑生产商 == 电脑型号：02【固定键盘和鼠标生产商】</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:47 2018-11-6
 * @version v0.1.1
 */
public class LianXiang02Factory implements IComputerFactory {

    @Override
    public IProduceKeyBord createKeyBord() {
        // 使用雷柏的键盘
        return new LeiBoKeyBord();
    }

    @Override
    public IProduceMouse createMouse() {
        // 使用罗技的鼠标
        return new LuoJiMouse();
    }
}
