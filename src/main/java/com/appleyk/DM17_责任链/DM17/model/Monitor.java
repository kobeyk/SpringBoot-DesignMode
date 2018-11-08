package com.appleyk.DM17_责任链.DM17.model;

/**
 * <p>显示器</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 2:03 2018-11-6
 * @Version V.1.0.1
 */
public class Monitor extends AbstractObject{

    /**
     * 尺寸
     */
    private  Integer size;

    public Monitor(){

    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public void show() {
        System.out.println("显示器");
    }
}
