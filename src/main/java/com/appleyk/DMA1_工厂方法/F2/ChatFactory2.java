package com.appleyk.DMA1_工厂方法.F2;

import com.appleyk.DMA1_工厂方法.DM1.Chat;
import com.appleyk.DMA1_工厂方法.DM1.QQ;
import com.appleyk.DMA1_工厂方法.DM1.WeiXin;

/**
 * <p>多方法工厂模式 == 需要哪个，就用哪个方法</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 10:25 2018-11-6
 * @version V.0.1.1
 */
public class ChatFactory2 {

    public Chat createQQChat(){
        return  new QQ();
    }
    public Chat createWeiXinChat(){
        return new WeiXin();
    }
}
