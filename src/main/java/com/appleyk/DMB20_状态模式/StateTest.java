package com.appleyk.DMB20_状态模式;

import com.appleyk.DMB20_状态模式.DM20.Context;

/**
 * <p>状态模式测试</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 下午 1:05 2019-8-29
 */
public class StateTest {

    public static void main(String[] args) {
        Context context = new Context();
        /**模拟开关的两种状态来回切换*/
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }

    /**
     * 状态（State）模式的定义：对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，
     *                      允许状态对象在其内部状态发生改变时改变其行为。
     *
     * 状态模式是一种对象行为型模式，其主要优点如下：
     *    （1）状态模式将与特定状态相关的行为局部化到一个状态中，并且将不同状态的行为分割开来，满足“单一职责原则”。
     *    （2）减少对象间的相互依赖。将不同的状态引入独立的对象中会使得状态转换变得更加明确，
     *    （3）且减少对象间的相互依赖。有利于程序的扩展。通过定义新的子类很容易地增加新的状态和转换。
     *
     * 状态模式的主要缺点如下:
     *    （1）状态模式的使用必然会增加系统的类与对象的个数。
     *    （2）状态模式的结构与实现都较为复杂，如果使用不当会导致程序结构和代码的混乱。
     */

}
