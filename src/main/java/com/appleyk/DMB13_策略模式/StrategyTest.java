package com.appleyk.DMB13_策略模式;

import com.appleyk.DMB13_策略模式.DM13.公式计算.ICalculator;
import com.appleyk.DMB13_策略模式.DM13.公式计算.Mul;
import com.appleyk.DMB13_策略模式.DM13.公式计算.Plus;
import com.appleyk.DMB13_策略模式.DM13.公式计算.Sub;
import com.appleyk.DMB13_策略模式.DM13.商场打折.DianShang618;
import com.appleyk.DMB13_策略模式.DM13.商场打折.Man300Jian100;
import com.appleyk.DMB13_策略模式.DM13.商场打折.PriceContext;
import com.appleyk.DMB13_策略模式.DM13.商场打折.Shuang11;

/**
 * <p>策略模式测试</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class StrategyTest {

    public static void main(String[] args) {

        // 1、 策略模式☞运算公式结果计算
        plus();
        sub();
        mul();

        // 2、 策略模式☞商场打折
        man300jian100();
        dianShang618();
        shuang11();
    }

    private static void plus(){
        System.out.println("===============2+ 8 乘法运算");
        ICalculator calculator = new Plus();
        double calculate = calculator.calculate("2+ 8");
        System.out.println("2+ 8 = "+calculate);
    }

    private static void sub(){
        System.out.println("===============2 - 8 减法运算");
        ICalculator calculator = new Sub();
        double calculate = calculator.calculate("2 - 8");
        System.out.println("2 - 8 = "+calculate);
    }

    private static void mul(){
        System.out.println("===============2*8 乘法运算");
        ICalculator calculator = new Mul();
        double calculate = calculator.calculate("2*8");
        System.out.println("2*8 = "+calculate);
    }

    private static void man300jian100(){

        System.out.println("===============全场满300减100！");
        double totalPrice = 450.0;
        System.out.println("商品原价："+totalPrice+"￥");
        PriceContext price = new PriceContext(new Man300Jian100());
        System.out.println("商品折后的价钱："+price.discount(totalPrice)+"￥");

    }

    private static void dianShang618(){

        System.out.println("===============电商节6.18欢快购！");
        double totalPrice = 700.0;
        System.out.println("商品原价："+totalPrice+"￥");
        PriceContext price = new PriceContext(new DianShang618());
        System.out.println("商品折后的价钱："+price.discount(totalPrice)+"￥");

        totalPrice = 1024.0;
        System.out.println("商品原价："+totalPrice+"￥");
        System.out.println("商品折后的价钱："+price.discount(totalPrice)+"￥");
    }

    private static void shuang11(){

        System.out.println("===============双11全场嗨翻购！");
        double totalPrice = 623.0;
        System.out.println("商品原价："+totalPrice+"￥");
        PriceContext price = new PriceContext(new Shuang11());
        System.out.println("商品折后的价钱："+price.discount(totalPrice)+"￥");

        totalPrice = 1500.0;
        System.out.println("商品原价："+totalPrice+"￥");
        System.out.println("商品折后的价钱："+price.discount(totalPrice)+"￥");
    }


    /**
     *
     * 百科上如此介绍策略模式：
     * 策略模式定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。
     * 策略模式让算法独立于使用它的客户而独立变化。
     *
     * 通过上述两个算法计算的例子，我们可以领略到策略模式的好处：
     * （1）用户或算法使用者可以选择不同的算法类来实现自己业务算法的需要
     * （2）开发者扩展新的算法类，只需要新建一个类实现calculate方法即可，扩展相当方便
     * （4）总结就是，遵守了"开闭原则"，对扩展开放，对修改关闭！
     * 缺点：
     * （1）如果基于选择的策略模式很多的话，这就意味着子类有很多，维护起来增加复杂性
     * （2）对于使用者来说，他必须知道全部的策略类，才可以做到策略的任意切换
     */

}
