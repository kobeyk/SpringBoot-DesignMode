package com.appleyk.DMB16_迭代子模式.DM16;

/**
 * <p>迭代器接口</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 */
public interface IIterator {

    /**
     * <p>当前迭代器中是否还有元素</p>
     *
     * @return 有（true） 没有（false）
     */
    boolean hasNext();

    /**
     * <p>取出迭代器中的元素</p>
     *
     * @return 对象
     */
    Object next();

    /**
     * <p>取出迭代器中的第一个元素</p>
     *
     * @return 第一个元素
     */
    Object first();

}
