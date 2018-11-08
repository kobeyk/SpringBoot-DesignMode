package com.appleyk.DM1_工厂方法.F3;

import com.appleyk.DM1_工厂方法.DM1.Chat;
import com.appleyk.DM1_工厂方法.DM1.QQ;
import com.appleyk.DM1_工厂方法.DM1.WeiXin;

/**
 * <p>静态工厂模式，无需创建工厂类实例</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 10:25 2018-11-6
 * @Version V.1.0.1
 */
public class ChatFactory3 {

    public static Chat createQQChat(){
        return  new QQ();
    }
    public static Chat createWeiXinChat(){
        return new WeiXin();
    }

}
