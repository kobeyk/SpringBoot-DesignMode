package com.appleyk.DMB16_迭代子模式;

import com.appleyk.DMB16_迭代子模式.DM16.AbstractAggregate;
import com.appleyk.DMB16_迭代子模式.DM16.IIterator;
import com.appleyk.DMB16_迭代子模式.DM16.MyCollection;

/**
 * <p>迭代子模式测试 == 典型的类似集合的方式实现了我们自己的迭代器,通过迭代器实现元素的遍历</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class IteratorTest {

    public static void main(String[] args) {
        myIterator();
    }

    private static void myIterator(){

        Integer[] numArr = new Integer[]{1,2,3};
        AbstractAggregate aggregate = new MyCollection(numArr);
        IIterator iterator = aggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("==============若想要迭代器继续迭代输出元素");
        System.out.println("first = " +iterator.first());
        System.out.println("==============我们可以调用first方法重置pos");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("==============我们再来创建一个迭代器对象出来");
        IIterator iteratorOther = aggregate.createIterator();
        while (iteratorOther.hasNext()){
            System.out.println(iteratorOther.next());
        }

    }

    /**
     * <p>资料如此描述迭代子模式：</p>
     * 迭代子模式又叫游标模式，是对象的行为模式。
     * 迭代子模式可以顺序的访问一个聚集中的元素而不必暴露聚集内部表象。
     *
     * 什么意思呢，博主来白话一下：
     * （1）这是对对象的操作，因此属于对象的行为操作范畴
     * （2）聚集对象可以进行元素的遍历,既然是遍历，肯定要讲究顺序的（pos++）
     * （3）使用者知道怎么遍历取出元素就行，具体聚合类是怎么实现的，
     *      不告诉你，反正你给我传一个数组就行，我给你创建一个迭代器出来，
     *      具体怎么玩，你拿着我给你创建好的迭代器琢磨去吧！
     *
     *  优点：
     *  （1）本来聚集类要干的事情，分担给具体的迭代器类了，聚集类和迭代器实现了很好的解耦，
     *       这样一来，迭代的算法可以完全独立于聚集类；
     *  （2）一个聚集类的对象，也就是聚集对象，可以创建出N个迭代器，同时进行元素迭代而互不干扰
     */

}
