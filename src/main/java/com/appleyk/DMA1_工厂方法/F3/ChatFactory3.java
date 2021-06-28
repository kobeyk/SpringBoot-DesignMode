package com.appleyk.DMA1_工厂方法.F3;

import com.appleyk.DMA1_工厂方法.DM1.IChat;
import com.appleyk.DMA1_工厂方法.DM1.QQ;
import com.appleyk.DMA1_工厂方法.DM1.WeiXin;

/**
 * <p>静态工厂模式，无需创建工厂类实例</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 10:25 2018-11-6
 * @version v0.1.1
 */
public class ChatFactory3 {
    public static IChat createQQChat(){
        return new QQ();
    }
    public static IChat createWeiXinChat(){
        return new WeiXin();
    }

}
