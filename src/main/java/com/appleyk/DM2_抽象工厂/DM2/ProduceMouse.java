package com.appleyk.DM2_抽象工厂.DM2;

/**
 * <p>鼠标接口 -- 生产鼠标</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:28 2018-11-6
 * @Version V.1.0.1
 */
     public interface ProduceMouse {
     /**
     * 约定鼠标生产的规格数据
     * @param name 名称
     * @param type 类型
     */
    public  void produceMouse(String name,String type);
}
