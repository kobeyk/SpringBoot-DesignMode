package com.appleyk.DM1_工厂方法.F2;

import com.appleyk.DM1_工厂方法.DM1.Chat;
import com.appleyk.DM1_工厂方法.DM1.QQ;
import com.appleyk.DM1_工厂方法.DM1.WeiXin;

/**
 * <p>多方法工厂模式 == 需要哪个，就用哪个方法</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 10:25 2018-11-6
 * @Version V.1.0.1
 */
public class ChatFactory2 {

    public Chat createQQChat(){
        return  new QQ();
    }
    public Chat createWeiXinChat(){
        return new WeiXin();
    }
}
