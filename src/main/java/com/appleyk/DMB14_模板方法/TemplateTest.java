package com.appleyk.DMB14_模板方法;

import com.appleyk.DMB14_模板方法.DM14.JDBC模板And回调实现.GoodsQueryServiceImpl;
import com.appleyk.DMB14_模板方法.DM14.JDBC模板And回调实现.UserQueryServiceImpl;
import com.appleyk.DMB14_模板方法.DM14.JDBC模板方法实现.AbstractJdbcTemplate;
import com.appleyk.DMB14_模板方法.DM14.JDBC模板方法实现.GoodsTemplateImpl;
import com.appleyk.DMB14_模板方法.DM14.JDBC模板方法实现.UserTemplateImpl;
import com.appleyk.DMB14_模板方法.DM14.父类固定算法步骤.AbstractCalculator;
import com.appleyk.DMB14_模板方法.DM14.父类固定算法步骤.Plus;
import com.appleyk.DMB14_模板方法.DM14.父类固定算法步骤.Sub;

import java.sql.SQLException;

/**
 * <p>模板方法测试</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class TemplateTest {

    public static void main(String[] args)  throws SQLException{
        calculate();
        jdbc();
        jdbcCallBack();
    }

    private static void calculate(){

        System.out.println("====================== 11 + 2 加法公式计算 ");
        AbstractCalculator plus = new Plus();
        System.out.println(plus.calculate("11 + 2", "\\+"));

        System.out.println("====================== 11 - 2 减法公式计算");
        AbstractCalculator sub = new Sub();
        System.out.println(sub.calculate("11 - 2", "\\-"));

    }

    private static void jdbc() throws SQLException {

        System.out.println("====================== 用户数据层操作实现 ");
        AbstractJdbcTemplate userTemplate = new UserTemplateImpl();
        userTemplate.execute("select * from user ");
        System.out.println("====================== 商品数据层操作实现 ");
        AbstractJdbcTemplate goodsTemplate = new GoodsTemplateImpl();
        goodsTemplate.execute("select * from goods ");

    }

    private static void jdbcCallBack() throws SQLException {

        System.out.println("====================== 用户数据层操作实现（模板+回调） ");
        UserQueryServiceImpl queryService = new UserQueryServiceImpl();
        queryService.query("select * from user ");
        System.out.println("====================== 商品数据层操作实现（模板+回调）");
        GoodsQueryServiceImpl goodsQueryService = new GoodsQueryServiceImpl();
        goodsQueryService.query("select * from goods ");

    }

    /**
     *
     * 百科中如此描述模板方法：
     * 模板方法模式定义了一个算法的步骤，并允许子类别为一个或多个步骤提供其实践方式。
     * 让子类别在不改变算法架构的情况下，重新定义算法中的某些步骤。
     *
     * 模板方法和策略模式有点像，都是由子类最终实现算法，二者区别是：
     * （1）策略模式定义了一个统一的算法接口，由具体的算法子类实现，所有的算法方法必须暴露给子类，
     *      由子类来实现，这样会产生一个问题，就是在执行算法之前如果有大量的数据准备工作，则会
     *      增加子算法方法块代码的臃肿度，使得大量代码重复得不到复用！
     * （2）模板方法定一个抽象的类，由父类统一定义实现算法的步骤，具体实现延迟到子类，
     *      属于算法"定制"，对特定的重复的算法部分实现了封装，只对扩展的部分暴露给子类！
     *
     *   优点：
     *   想必不用说，我们都可以看出来，模板方法的一个最大的好处就是实现了重复代码的复用！
     *   另外一个就是，扩展很方便！
     *   缺点：
     *   和策略模式一样，也存在子类过多的情况出现，类一多，维护起来的复杂度就增加了！
     *
     *   <p>假如，一个抽象类有4个子类，你可能会说，也就才4个啊，半个小时都能看的透透彻彻了</p>
     *   <p>假如，一个抽象类有100个子类，你可能会皱着眉头说，卧槽，这特么还是人吗，怎么写了这么多？</p>
     *   <p>所以，类并不是越多越能体现系统的健壮性，反而多了会适得其反噢！</p>
     */


}
