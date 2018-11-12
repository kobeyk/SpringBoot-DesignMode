package com.appleyk.DMA2_抽象工厂.DM2;

/**
 * <p>电脑抽象工厂接口 == 只提供电脑组件的组装，具体组装成什么样型号的电脑，再由具体工厂类决定</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:44 2018-11-6
 * @Version V.1.0.1
 */
public abstract  interface AComputerFactory {
    ProduceKeyBord createKeyBord();
    ProduceMouse createMouse();
}
