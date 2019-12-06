package com.appleyk.DMB19_备忘录模式.DM19.传统模式;

/**
 * <p>原始类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class Original {

    /**
     * 备忘录的值
     */
    private String value;

    public Original(String value) {
        this.value = value;
    }

    /**
     * <p>创建一个备忘录</p>
     * @return 备忘录对象
     */
    public Memento createMemento(){

        /**
         * 每次都创建一个备忘录对象，并将旧值当参数给它
         * 也就是新进来的值，影响不到原来的备忘录对象
         */
        return new Memento(value);
    }

    /**
     * <p>恢复备忘录的值</p>
     * @param memento 备忘录对象
     */
    public void restoreMemento(Memento memento){
       this.value = memento.getValue();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
