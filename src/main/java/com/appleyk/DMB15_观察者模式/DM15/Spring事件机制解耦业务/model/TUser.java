package com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * <p>用户业务模型</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 13:27 2021/2/21
 */
@Data
@Builder
@AllArgsConstructor
public class TUser {
    /**注册时间*/
    private Long uid;
    /**用户名，唯一*/
    private String userName;
    /**用户密码*/
    private String password;
    /**昵称*/
    private String nickName;
    /**邮箱（用户注册成功后，要给用户填写的邮箱发一封邮件以确认！）*/
    private String email;
    /**注册时间*/
    private Date registerTime;
}
