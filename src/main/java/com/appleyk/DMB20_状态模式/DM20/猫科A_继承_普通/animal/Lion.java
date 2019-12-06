package com.appleyk.DMB20_状态模式.DM20.猫科A_继承_普通.animal;

/**
 * <p>狮子</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 11:37 2019/12/6
 */
public class Lion extends AbstractFeline{

    @Override
    public void climbing() {
        System.out.println("我是【"+getName()+"】,我太笨重了，我不会爬树！");
    }

    @Override
    public String getName() {
        return "狮子之王·辛巴";
    }
}
