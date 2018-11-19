package com.appleyk.DMA9_外观模式.DM9.ModuleB;

/**
 * <p>模块B下的子系统C</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 9:00 2018-11-12
 * @Version V.1.0.1
 */
public class SubSystemC {

    public void sayHello(){
        System.out.println("欢迎进入Appleyk's 基于电影知识图谱的人工智能系统 =====>"+this);
        System.out.println("关于系统的介绍请参考博文：https://blog.csdn.net/Appleyk/article/details/80422055");
    }
    @Override
    public String toString(){
        return "人工智能系统，模块B，子系统C，欢迎界面";
    }
}
