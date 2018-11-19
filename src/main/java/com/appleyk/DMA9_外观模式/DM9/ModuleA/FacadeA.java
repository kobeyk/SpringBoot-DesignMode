package com.appleyk.DMA9_外观模式.DM9.ModuleA;

/**
 * <p>外观模式A == 聚合子模块A中的子系统A和B，降低客户端操作子模块A的复杂度</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 9:13 2018-11-12
 * @Version V.1.0.1
 */
public class FacadeA {

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;

    public  FacadeA(){
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
    }

    /**
     * 将模块A的功能封装一下，松散客户端与A模块中的各个子系统间的耦合关系
     * 让模块中的各个子系统更容易扩展和维护
     */
    public void initialize(){
        subSystemA.initSystem();
        subSystemB.loadDasta();
    }
}
