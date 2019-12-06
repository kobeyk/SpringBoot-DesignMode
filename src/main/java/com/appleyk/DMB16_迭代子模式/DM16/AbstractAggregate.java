package com.appleyk.DMB16_迭代子模式.DM16;

/**
 * <p>抽象出来一个聚集类 == 提供创建集合对象迭代器的一系列抽象方法</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public abstract class AbstractAggregate {

    /**
     * <p>创建聚集对象的迭代器 == 使用迭代器对集合进行相关操作</p>
     * @return 对象的迭代器
     */
    public abstract IIterator createIterator();

    /**
     * <p>返回聚集对象（集合、迭代器对象）包含的对象（元素）的大小</p>
     * @return 大小
     */
    public abstract int size();

    /**
     * <p>聚集对象包含的元素是否为空</p>
     * @return 空（true）不空（false）
     */
    public abstract boolean isEmpty();

}
