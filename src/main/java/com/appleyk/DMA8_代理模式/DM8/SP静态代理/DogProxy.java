package com.appleyk.DMA8_代理模式.DM8.SP静态代理;

import com.appleyk.DMA8_代理模式.DM8.service.CommodityService;
import com.appleyk.DMA8_代理模式.DM8.service.impl.DogImpl;

/**
 * <p>宠物狗代理类 == 静态代理模式</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 2018年11月10日 - 下午8:25:51
 * @Version V.1.0.1
 */
public class DogProxy implements CommodityService{

	private DogImpl dog;
	
	public DogProxy(){
		// 预先确定代理与被代理者的关系 -- 被代理的对象是宠物狗
		dog = new DogImpl();
	}	
	
	@Override
	public void getCommodity(String name) {
		System.out.println("我是UU跑腿的工作人员，我去超市帮助狗狗取狗粮："+name);
		dog.getCommodity(name);
		System.out.println("商品已成功交给狗狗，期待狗狗的主人好评");
	}

}
