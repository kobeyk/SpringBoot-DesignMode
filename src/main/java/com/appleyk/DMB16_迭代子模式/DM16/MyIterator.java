package com.appleyk.DMB16_迭代子模式.DM16;

/**
 * <p>自定义迭代器，实现迭代器接口中的所有方法</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class MyIterator implements IIterator{

    /**
     * 迭代器的目标对象，就是集合
     */
    private MyCollection collection ;

    /**
     * 这里保留一份集合对象包含的元素的大小
     */
    private int size ;

    /**
     * 记录元素的位置
     */
    private int pos = 0 ;

    public MyIterator(MyCollection collection){
        this.collection = collection ;
        this.size = collection.size();
    }

    @Override
    public boolean hasNext() {

        /**
         * （1）只要size不等于pos初始化时候的0，集合里肯定是有元素的
         * （2）返回true的时候，一定不要忘了让pos往后移，这就是迭代器只能使用一次的原因所在
         * （3）如果想复用迭代器，调用first函数，重置pos位置的值
         */
        if(pos < size){
            pos++;
            return true;
        }
        return false;

    }

    @Override
    public Object next() {
        return collection.getObjArr()[pos-1];
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.getObjArr()[0];
    }
}
