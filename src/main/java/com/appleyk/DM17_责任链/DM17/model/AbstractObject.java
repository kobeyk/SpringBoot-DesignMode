package com.appleyk.DM17_责任链.DM17.model;

/**
 * <p>抽象对象类</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:57 2018-11-6
 * @Version V.1.0.1
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
