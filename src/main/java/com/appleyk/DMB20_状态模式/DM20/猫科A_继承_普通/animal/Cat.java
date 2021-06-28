package com.appleyk.DMB20_状态模式.DM20.猫科A_继承_普通.animal;

/**
 * <p>家养的猫</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 11:27 2019/12/6
 */
public class Cat extends AbstractFeline {

    @Override
    public void swimming() {
        System.out.println("我是【" + getName() + "】,我怕水，我不会游泳");
    }

    @Override
    public String getName() {
        return "黑猫警长";
    }
}
