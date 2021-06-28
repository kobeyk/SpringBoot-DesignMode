package com.appleyk.DMB17_责任链.DM17.model;

/**
 * <p>电脑【组装电脑】</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:59 2018-11-6
 * @version v0.1.1
 */
public class Computer extends AbstractObject{

    /**
     * 公司 -- 如联想、华硕、苹果...etc
     */
    private String company;

    /**
     * 价钱
     */
    private Double price;

    /**
     * 组成 -- 显示器
     */
    private Monitor monitor;

    /**
     * 组成 -- 键盘
     */
    private KeyBord keyBord;

    /**
     * 组成 -- 鼠标
     */
    private Mouse mouse;

    public  Computer(String company,Double price){
        this.company = company;
        this.price = price;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public KeyBord getKeyBord() {
        return keyBord;
    }

    public void setKeyBord(KeyBord keyBord) {
        this.keyBord = keyBord;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public void show() {
        System.out.println("电脑");
    }
}
