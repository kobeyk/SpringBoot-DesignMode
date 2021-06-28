package com.appleyk.DMB17_责任链;

import com.appleyk.DMB17_责任链.DM17.filter.ComputerFilter;
import com.appleyk.DMB17_责任链.DM17.model.Computer;
import com.appleyk.DMB17_责任链.DM17.query.ComputerQueryService1;
import com.appleyk.DMB17_责任链.DM17.query.ComputerQueryService2;
import com.appleyk.utils.JsonUtils;

import java.util.List;

/**
 * <p>责任链测试</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:55 2018-11-6
 */
public class HandlerTest {

    public static void main(String[] args) {

        ComputerFilter filter = new ComputerFilter();

        // 查询电脑编号等于1001和1002的信息
        filter.addIds(1001L);
        filter.addIds(1002L);
        // 载入显示器信息
        filter.setLoadMonitor(true);
        // 载入鼠标信息
        filter.setLoadMouse(true);

        // 不使用任务链模式进行查询
        noUseHandler(filter);

        // 使用任务链模式进行查询
        useHandler(filter);

        /**
         * 通过两种查询对比，你会发现：
         * 1、查询结果都一样
         * 2、没有使用任务链设计模式的service层代码非常臃肿，而使用了任务链的service层看起来很棒
         * 3、如果一个service只干一件事的话，无疑第一种service干了很多事情，比如把电脑组件的加载都放在了当前类中
         *    一旦这个service的代码越来越多，后期维护起来会很困难，不如每个组件的加载单独交给一个任务来处理，
         *    反正数据和参数都是固定的【这句话很重要，值得深思，如果参数不固定，要怎么改造呢？ 自己尝试吧...】
         * 4、使用了任务链的service，在查询结果的时候，只要知道参与此次查询的任务都有哪些，任务之间的衔接关系是什么
         *    至于任务链中的每个任务都干了什么，不在当前service层中体现出来
         *    总之，给我数据和条件，剩下的你就不用管了，我最后给你返回正确的结果就行了
         */

    }

    private static void useHandler(ComputerFilter filter) {
        ComputerQueryService2 q2 = new ComputerQueryService2();
        List<Computer> computers2 = q2.query(filter);
        System.out.println(JsonUtils.objectToJson(computers2));
    }

    private static void noUseHandler(ComputerFilter filter) {
        ComputerQueryService1 q1 = new ComputerQueryService1();
        List<Computer> computers1 = q1.query(filter);
        System.out.println(JsonUtils.objectToJson(computers1));
        System.out.println("======================分割线");
    }
}
