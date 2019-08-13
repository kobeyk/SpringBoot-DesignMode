package com.appleyk.DMB19_备忘录模式;

import com.appleyk.DMB19_备忘录模式.DM19.事务回滚.OriginData;
import com.appleyk.DMB19_备忘录模式.DM19.事务回滚.TransitionStorage;
import com.appleyk.DMB19_备忘录模式.DM19.传统模式.Original;
import com.appleyk.DMB19_备忘录模式.DM19.传统模式.Storage;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>备忘录测试</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class MementoTest {

    public static void main(String[] args) {

        // 1、传统备忘录模式
        memento();
        System.out.println("========================== =========================");
        // 2、模拟事务回滚
        transition();

    }

    private static void memento(){

        Original original = new Original("明天周一，我们去吃火锅吧！");

        // 1、为了记住明天事情，我需要将这条信息记录下来
        Storage storage = new Storage(original.createMemento());

        System.out.println("主意没变前："+original.getValue());

        // 2、明天，我又想吃北京烤鸭了
        original.setValue("明天周一，我们还是去吃北京烤鸭吧！");

        System.out.println("主意改变后："+original.getValue());

        /**
         * 3、后来想了想，我还是不吃北京烤鸭了，这个太油腻了
         * 但是我又想不起来之前我想要吃什么了，怎么办，我们去翻一下备忘录好了
         * 我们从抽屉里拿出我们的备忘录，然后恢复下
         */
        original.restoreMemento(storage.getMemento());

        // 4、通过翻看之前记录在备忘录里面的内容，我发现明天我是要吃火锅的
        System.out.println("主意反悔后："+original.getValue());

    }

    private static void transition(){

        // 初始化三条数据
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);

        OriginData originData = new OriginData(data);

        // 1、添加一个元素，添加前，先备份下
        TransitionStorage storage = new TransitionStorage(originData.createJournal());
        printLog("增加一个数据前",originData);
        originData.addData(4);
        // 2、添加一个元素后，再备份下
        storage.backup(originData.createJournal());
        printLog("增加一个数据后",originData);

        // 3、删除一个元素前
        originData.remove(2);
        // 4、删除一个元素后，备份下
        storage.backup(originData.createJournal());
        printLog("删除一个数据后",originData);

        /**
         * 5、现在有了两次操作，一次增加，一次删除，现在我们要恢复到删除前的数据
         *    即回滚事务日志ID = 2的记录
         */
        originData.restoreJournal(storage.getLogMap(2));
        printLog("根据事物日志id=2,恢复数据后",originData);
    }

    private static void printLog(String message,OriginData originData){
        System.out.println(message+originData+"，当前事务日志ID："+originData.getLogNum());
    }

    /**
     * 百科如此描述备忘录模式：
     * 在不破坏封闭的前提下，捕获一个对象的内部状态，
     * 并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态
     *
     * 这个不难理解，其实就是把我们之前写下来的东西记录起来，然后放在一个专门存储的地方存起来
     *
     * 优点：
     * （1）对象的状态可以被存储和管理起来，对象的状态可以任意回退，不用担心由于误操作而造成对象状态的丢失
     * （2）对象状态的存储，对于用户或使用来者说，是屏蔽的，用户无需关心怎么实现，只需要启用备忘模式即可
     * 缺点：
     *      大量的对象的状态存储，需要耗费大量的资源，比如内存资源的消耗
     */

}
