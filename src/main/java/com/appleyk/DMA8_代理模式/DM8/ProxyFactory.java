package com.appleyk.DMA8_代理模式.DM8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.appleyk.DMA8_代理模式.DM8.DP动态代理.DynamicProxy;
import com.appleyk.DMA8_代理模式.DM8.SP静态代理.DogProxy;
import com.appleyk.DMA8_代理模式.DM8.SP静态代理.UserProxy;
import com.appleyk.DMA8_代理模式.DM8.service.CommodityService;

/**
 * <p>代理类工厂</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午7:04:23
 */
public class ProxyFactory {

    /**
     * 获取一个静态用户代理类对象
     */
    public static CommodityService getUserProxy() {
        return new UserProxy();
    }

    /**
     * 获取一个静态宠物狗的代理类对象
     */
    public static CommodityService getDogProxy() {
        return new DogProxy();
    }

    public static Object getDynProxy(Object target) {
        InvocationHandler handler = new DynamicProxy(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }

}
