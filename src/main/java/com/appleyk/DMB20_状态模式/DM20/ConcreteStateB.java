package com.appleyk.DMB20_状态模式.DM20;

/**
 * <p>具体实现的状态类B</p>
 *
 * @author appleyk
 * @version V.1.0.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 2019/12/6 11:00 PM
 */
public class ConcreteStateB extends AState{

    @Override
    public void handle(Context context) {
        System.out.println("我是状态B,关");
        context.setState(new ConcreteStateA());
    }
}
