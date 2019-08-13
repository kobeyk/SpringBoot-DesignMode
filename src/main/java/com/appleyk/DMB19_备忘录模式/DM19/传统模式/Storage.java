package com.appleyk.DMB19_备忘录模式.DM19.传统模式;

/**
 * <p>存储备忘录的内容，可以理解为，备忘录如果是一本书的话，那存储类就是一个抽屉或者其他</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class Storage {

    /**
     * 关联一个备忘录对象，这种模式真的是很常见啊
     * 注意，这里可以是一个列表，也可以是单个对象
     * 是单数还是复数，具体看storage的业务需要
     */
    private Memento memento ;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
