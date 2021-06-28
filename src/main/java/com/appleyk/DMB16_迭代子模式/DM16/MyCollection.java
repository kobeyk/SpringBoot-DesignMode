package com.appleyk.DMB16_迭代子模式.DM16;

/**
 * <p>自定义集合类，实现聚集抽象类中的迭代器的创建方法</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 */
public class MyCollection extends AbstractAggregate {

    /**
     * 集合的底层用的就是数组
     */
    Object[] objArr;

    public MyCollection(Object[] objArr) {
        this.objArr = objArr;
    }

    @Override
    public IIterator createIterator() {
        /**
         * 将当前集合对象作为参数，调用迭代器的构造函数
         * 注意，该方法的NB之处，就是同一个聚集对象可以new出来好多个迭代器
         * 虽然，上面一段话说出来跟没说一样，但是博主还是想傻傻的强调一下
         */
        return new MyIterator(this);
    }

    @Override
    public int size() throws NullPointerException {
        if (objArr == null) {
            throw new NullPointerException("objArr is null !");
        }
        return objArr.length;
    }

    @Override
    public boolean isEmpty() throws NullPointerException {
        if (objArr == null) {
            throw new NullPointerException("objArr is null !");
        }
        return objArr.length == 0;
    }

    public Object[] getObjArr() {
        return objArr;
    }

    public void setObjArr(Object[] objArr) {
        this.objArr = objArr;
    }
}
