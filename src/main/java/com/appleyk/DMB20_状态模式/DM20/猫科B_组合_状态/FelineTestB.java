package com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态;


import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.animal.AbstractFeline;
import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.animal.Cat;
import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.animal.Lion;
import com.appleyk.DMB20_状态模式.DM20.猫科B_组合_状态.behavior.CanClimb;

/**
 * <p>猫 == 就是我们家养的猫</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date created on 11:28 2019/12/6
 * @version V.0.1.1
 */
public class FelineTestB {

    public static void main(String[] args) {
        catDisplay();
        System.out.println("=======================");
        lionDisplay();
    }

    private static void catDisplay(){
        AbstractFeline feline = new Cat();
        feline.climbing();
        feline.swimming();
    }

    private static void lionDisplay(){
        AbstractFeline feline = new Lion(new CanClimb());
        feline.climbing();
        feline.swimming();
    }

    /**
     * 接着【猫科A_继承_普通】讲：
     * 《
     *      之前说了设计的三大原则，其中一条就是少用继承，多用组合：
     *      少用继承我们已经通过案例说明了，然后组合的方式我们也已经看到成效了，其实就是将对象的
     *      行为进行抽离，比如猫科动物的爬和游抽离出来两个行为接口，具体的行为实现再分为会游泳的和
     *      不会游泳的，会爬树的和不会爬树的；然后通过组合的方式在超类Feline中定义两个行为变量，具体
     *      子类实现什么行为，由子类在实例化的时候决定，这样一来，组合的方式就变得灵活和易于扩展了！
     *      而不是像继承那样，子类的行为发生改变时，还要去重写父类的方法；现在则是：
     *      对象的行为依赖于他的状态（一个或多个属性），并且可以基于他的状态的改变去影响他的相关行为！
     *
     *      解释一下就是：
     *           对象因外部的互动而导致他的状态发生变化，从而他的行为会做出相应的变化。
     *           比如上述的狮子本来是不会游泳的，但是通过我们手动的new Lion(new CanClimb())，
     *           指定其可以爬树（改变其属性值），最终导致输出结果：我是【狮子之王·辛巴】,我会爬树！
     *
     *  》
     */

}
