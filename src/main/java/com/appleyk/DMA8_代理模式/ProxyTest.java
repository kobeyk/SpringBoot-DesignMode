package com.appleyk.DMA8_代理模式;
import com.appleyk.DMA8_代理模式.DM8.ProxyFactory;
import com.appleyk.DMA8_代理模式.DM8.NP非代理.UserOwn;
import com.appleyk.DMA8_代理模式.DM8.VP虚拟代理.Secretary;
import com.appleyk.DMA8_代理模式.DM8.service.CommodityService;
import com.appleyk.DMA8_代理模式.DM8.service.impl.DogImpl;
import com.appleyk.DMA8_代理模式.DM8.service.impl.UserImpl;

/**
 * <p>代理模式测试</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 2018年11月10日 - 下午5:15:19
 * @Version V.1.0.1
 */
public class ProxyTest {

	public static void main(String[] args){

		String uName = "奥利奥饼干";
		String dName = "狗粮";
		// 1、不使用代理
		noProxy(uName);
		// 2、使用静态代理
		useStaticProxy(uName,dName);
		// 3、使用动态代理
		useDynamicProxy(uName, dName);

		int second = 5;
		// 4、使用虚拟代理
		useVirtualProxy(second);
		
		/**
		 * 不使用代理:没有对比就没有伤害，主要和下面使用了代理模式的对象进行比较
		 * 静态代理:针对特定对象的访问进行"装饰"，虽和装饰者模式很像，但也只是很像，切记搞混淆
		 * 动态代理:区别静态代理，静态代理模式在程序编译时即确定了被代理的对象
		 * 		     而动态代理只有在程序运行时才确定要被代理的对象是谁
		 *        动态代理主要应用于框架，即反射技术一般用不到，如果用到了，那多半是用于框架级的项目
		 *        典型代表：Spring框架 -- AOP【面向切面编程】
		 * 虚拟代理:可延缓被代理对象的创建
		 *        优点: 程序启动快
		 *        缺点: 因为被代理的实例不是在第一时间创建的，因此在使用的时候，
		 *             需要狠小心的判断null值，以防止NullPointException
		 *             
		 * 还有其他代理模式，就不一一列举了	      
		 */
	}

	
	/**
	 * 不使用代理
	 * @param uName 用户商品名称
	 */
	private static void noProxy(String uName) {
		// 使用代理模式，用户自己去超市买商品
		UserOwn userOwn = new UserOwn();
		userOwn.getCommodity(uName);
		System.out.println("===========分割线");
	}
	
	
	/**
	 * 使用静态代理
	 * @param uName 用户商品名称
	 * @param dName 宠物狗商品名称
	 */
	private static void useStaticProxy(String uName,String dName) {
		// 使用静态代理模式，通过UU跑腿服务，用户拿到自己要的薯片
		ProxyFactory.getUserProxy().getCommodity(uName);
		System.out.println("===========分割线");
		// 使用静态代理模式，通过UU跑腿服务，宠物狗拿到自己要的狗粮
		ProxyFactory.getDogProxy().getCommodity(dName);
		System.out.println("===========分割线");
	}
	
	/**
	 * 使用动态代理
	 * @param uName 用户商品名称
	 * @param dName 宠物狗商品名称
	 */
	private static void useDynamicProxy(String uName, String dName) {
		// 使用动态代理模式，通过UU跑腿服务，用户拿到自己要的薯片
		CommodityService userProxy =(CommodityService)( ProxyFactory.getDynProxy(new UserImpl()));
		userProxy.getCommodity(uName);
		System.out.println("===========分割线");
		
		// 使用动态代理模式，通过UU跑腿服务，宠物狗拿到自己要的狗粮
		CommodityService dogProxy =(CommodityService)( ProxyFactory.getDynProxy(new DogImpl()));
		dogProxy.getCommodity(dName);
		System.out.println("===========分割线");
	}

	/**
	 * 使用虚拟代理
	 * @param second 秒数
	 */
	private static void useVirtualProxy(int second){
	
		Secretary secretary = new Secretary();
		secretary.addDeal("合同1");
		secretary.addDeal("合同2");
		secretary.sign();
		
		// 期望领导什么时候出现
		secretary.initLeader(second);
		
		secretary.addDeal("合同3");
		secretary.addDeal("合同4");
		secretary.sign();
		
	}	
	
}
