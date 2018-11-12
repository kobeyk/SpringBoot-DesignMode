package com.appleyk.DMA8_代理模式.DM8.SP静态代理;

import com.appleyk.DMA8_代理模式.DM8.service.CommodityService;
import com.appleyk.DMA8_代理模式.DM8.service.impl.UserImpl;

/**
 * <p>用户代理类 == 静态代理模式，被代理的对象在编译时就知道了</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 2018年11月10日 - 下午5:27:46
 * @Version V.1.0.1
 */
public class UserProxy implements CommodityService{
	
	/**
	 * 区别于装饰者模式，这里的被代理的对象的实例是在代理的类中完成实例化的，不对外暴露
	 * 虽然代理模式有点类似于装饰者模式，但是本质上还是有区别的
	 * 1、代理模式主要是控制某个特定对象的访问
	 * 2、装饰模式主要是给对象添加行为
	 * 3、不是所有实现了接口的类对象都可以成为被代理的对象【要深刻理解这句话】
	 * 4、所有实现了接口的类对象都可以成为被装饰的对象
	 */
	private UserImpl user;
	
	public UserProxy() {
		// 预先确定代理与被代理者的关系 -- 被代理的对象是人
		user = new UserImpl();
	}

	@Override
	public void getCommodity(String name) {
		System.out.println("我是UU跑腿的工作人员，我去超市帮助用户取商品："+name);
		user.getCommodity(name);
		System.out.println("商品已成功交给用户，期待用户好评");
	}

}
