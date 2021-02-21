package com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.dao;

import com.appleyk.DMB15_观察者模式.DM15.Spring事件机制解耦业务.model.TUser;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>用户Dao层</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 13:32 2021/2/21
 */
@Service
public class UserDao {
    public TUser save(TUser user) throws Exception{
        user.setUid(System.currentTimeMillis());
        user.setRegisterTime(new Date());
        // 模拟db的insert操作，假设耗时200ms
        Thread.sleep(200);
        return user;
    }
}
