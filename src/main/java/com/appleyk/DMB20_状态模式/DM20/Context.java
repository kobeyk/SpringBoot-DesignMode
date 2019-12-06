package com.appleyk.DMB20_状态模式.DM20;

/**
 * <p>环境类</p>
 *
 * @author appleyk
 * @version V.1.0.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 2019/12/6 10:59 PM
 */
public class Context {

    /**持有一个状态*/
    private AState state;

    public Context() {
        //初始化状态为A,开
        this.state = new ConcreteStateA();
    }

    public void handle(){
        state.handle(this);
    }

    public AState getState() {
        return state;
    }

    public void setState(AState state) {
        this.state = state;
    }
}
