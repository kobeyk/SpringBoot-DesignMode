package com.appleyk.DMA8_代理模式.DM8.service.impl;

import com.appleyk.DMA8_代理模式.DM8.service.CommodityService;

/**
 * <p>宠物狗实现商品接口 == 获取狗粮</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 2018年11月10日 - 下午8:14:38
 * @Version V.1.0.1
 */
public class DogImpl implements CommodityService{

	@Override
	public void getCommodity(String name) {
		System.out.println("宠物狗获得商品："+name);
	}

}
