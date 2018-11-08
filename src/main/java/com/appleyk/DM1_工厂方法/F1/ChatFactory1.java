package com.appleyk.DM1_工厂方法.F1;

import com.appleyk.DM1_工厂方法.DM1.Chat;
import com.appleyk.DM1_工厂方法.DM1.QQ;
import com.appleyk.DM1_工厂方法.DM1.WeiXin;

/**
 * <p>单方法工厂模式</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 10:25 2018-11-6
 * @Version V.1.0.1
 */
public class ChatFactory1 {

    public Chat createChat(String tools){
        if("QQ".equals(tools)){
            return  new QQ();
        }else if("WeiXin".equals(tools)) {
            return  new WeiXin();
        }else{
            return null;
        }
    }
}
