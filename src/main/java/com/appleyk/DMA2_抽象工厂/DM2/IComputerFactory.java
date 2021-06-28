package com.appleyk.DMA2_抽象工厂.DM2;

/**
 * <p>
 *     电脑抽象工厂接口 == 只提供电脑组件的组装，具体组装成什么样型号的电脑，再由具体工厂类决定
 *     当然，你把这个定义成抽象类也是可以的
 * </p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:44 2018-11-6
 * @version v0.1.1
 */
public interface IComputerFactory {
    IProduceKeyBord createKeyBord();
    IProduceMouse createMouse();
}
