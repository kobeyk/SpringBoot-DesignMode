package com.appleyk.DMA5_建造者模式;

import com.appleyk.DMA5_建造者模式.DM5.Cake;
import com.appleyk.DMA5_建造者模式.DM5.CakeMaker;
import com.appleyk.DMA5_建造者模式.DM5.CakeSeller;

/**
 * <p>建造者模式测试 == 客户购买蛋糕</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:32 2018-11-9
 * @version v0.1.1
 */
public class BuilderTest {

    /**
     * 1、假设我要去蛋糕店买蛋糕,我只需要付钱，蛋糕销售员给我一个蛋糕即可
     * 2、作为购买者，我不关心我买到的蛋糕是怎么制作出来的，即我只关心显示【蛋糕】，不关心行为【制作蛋糕】
     * 3、而蛋糕肯定是按照一定的制作工序才能制作出来的，谁会这种制作工序呢？答案肯定是蛋糕制作师傅了
     * 4、话又说回来，蛋糕师傅只会制作蛋糕，他并不关心蛋糕的去向
     * 5、但是客户又要买蛋糕，所以最后还是会绕到销售员的身上
     * 6、即 -- 蛋糕制作师傅  --> 蛋糕销售员 --> 蛋糕购买者
     *
     * 接下来，我们来实现一下
     */
    public static void main(String[] args) {

        /**先指定一个蛋糕师傅  == 李师傅*/
        CakeMaker cakeMaker = new CakeMaker("李师傅");

        /**指定蛋糕销售员*/
        CakeSeller cakeSeller = new CakeSeller();

        /**销售员卖个客户一个蛋糕 == 注意，这个蛋糕的制作工程已经被隐藏了*/
        Cake cake = cakeSeller.sell(cakeMaker);

        /**这一句其实没必要显示，这里显示是为了说明，蛋糕不是平白无故的创造出来的*/
        cake.show();

        /**
         * Product： 具体产品【本案例中☞Cake】
         * Builder： 创建一个Product对象的各个部分指定的抽象接口【本案例中☞CakeBuilder】
         * ConcreteBuilder：具体的建造者，实现Builder接口，构建和装配各个部件【本案例中☞CakeMaker】
         * Director： 构建一个使用builder接口的对象【本案例中☞CakeSeller】
         * 场景：创建一些复杂的对象，这些对象内部构建之间的建造顺序是稳定的，但是对象内部的构建通常面临着复杂的变化
         * 好处：建造代码与表示代码分离，隐藏了该产品是如何组装的，
         *       若需要改变一个产品的内部表示，只需要再定义一个具体的建造者就可以了 == 这个就非常很了
         */
    }

}
