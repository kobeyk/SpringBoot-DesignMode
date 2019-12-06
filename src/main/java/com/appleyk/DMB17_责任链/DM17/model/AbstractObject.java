package com.appleyk.DMB17_责任链.DM17.model;

/**
 * <p>抽象对象类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:57 2018-11-6
 * @version V.0.1.1
 */
public abstract  class AbstractObject {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void show();
}
