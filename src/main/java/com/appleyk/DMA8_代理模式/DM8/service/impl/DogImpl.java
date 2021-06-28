package com.appleyk.DMA8_代理模式.DM8.service.impl;

import com.appleyk.DMA8_代理模式.DM8.service.CommodityService;

/**
 * <p>宠物狗实现商品接口 == 获取狗粮</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午8:14:38
 */
public class DogImpl implements CommodityService {

    @Override
    public void getCommodity(String name) {
        System.out.println("宠物狗获得商品：" + name);
    }

}
