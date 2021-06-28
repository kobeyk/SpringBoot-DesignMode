package com.appleyk.DMB19_备忘录模式.DM19.传统模式;

/**
 * <p>备忘录类</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 */
public class Memento {

    /**
     * 真正备忘录里面的值
     */
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
