package com.appleyk.DMA8_代理模式.DM8.service.impl;

import com.appleyk.DMA8_代理模式.DM8.service.CommodityService;

/**
 * <p>用户实现商品类 == 获取吃的</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午5:26:05
 */
public class UserImpl implements CommodityService {

    @Override
    public void getCommodity(String name) {
        System.out.println("用户获得商品：" + name);
    }

}
