package com.appleyk.DM2_抽象工厂;

import com.appleyk.DM2_抽象工厂.DM2.ProduceKeyBord;
import com.appleyk.DM2_抽象工厂.DM2.ProduceMouse;
import com.appleyk.DM2_抽象工厂.Factory.LianXiang01Factory;
import com.appleyk.DM2_抽象工厂.Factory.LianXiang02Factory;

/**
 * <p>抽象工厂测试 == 具体工厂类实现不同电脑组件的生产</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:25 2018-11-6
 * @Version V.1.0.1
 */
public class AFactoryTest {

    public static void main(String[] args) {

        // 用户需要购买联想的电脑，但要求键盘和鼠标都是雷柏的，于是便找到了对应的01电脑组装工厂进行生产
        LianXiang01Factory lianXiang01Factory = new LianXiang01Factory();
        ProduceKeyBord keybord1 = lianXiang01Factory.createKeyBord();
        keybord1.produceKeyBord("M550", "黑色");
        ProduceMouse Mouse1 = lianXiang01Factory.createMouse();
        Mouse1.produceMouse("M590", "有线");

        System.out.println("=======================分割线，注意区别");

        // 用户需要购买联想的电脑，但要求键盘是雷柏的，鼠标是罗技的，于是便找到了对应的02电脑组装工厂进行生产
        LianXiang02Factory lianXiang02Factory = new LianXiang02Factory();
        ProduceKeyBord keybord2 = lianXiang02Factory.createKeyBord();
        keybord2.produceKeyBord("M550", "黑色");
        ProduceMouse Mouse2 = lianXiang02Factory.createMouse();
        Mouse2.produceMouse("M590", "无线");


        /**
         * 好处：横向扩展很容易，如果我需要再增加一个电脑型号的生产线，比如HP【惠普】，只需要在创建一个对应的工厂实现抽象工厂即可
         * 坏处：纵向扩展很麻烦，如果我需要增加显示器的生产接口，那么改动的地方就太多了，自己领会吧，可以尝试一下
         */
    }

}
