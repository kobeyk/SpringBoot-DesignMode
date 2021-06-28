package com.appleyk.DMA7_装饰者模式;

import com.appleyk.DMA7_装饰者模式.DM7.FolderA;
import com.appleyk.DMA7_装饰者模式.DM7.FolderB;
import com.appleyk.DMA7_装饰者模式.DM7.FolderDecorator;

/**
 * <p>装饰者模式测试</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午4:05:50
 */
public class DecoratorTest {

    public static void main(String[] args) {

        /**
         * 扩展在Windows系统中的文件创建和删除功能
         */
        FolderA folderA = new FolderA();
        FolderDecorator folderDecoratorA = new FolderDecorator(folderA);
        folderDecoratorA.mkDir();
        folderDecoratorA.rmdir();

        System.out.println("============= 分割线");

        /**
         * 扩展在Linux系统中的文件创建和删除功能
         */
        FolderB folderB = new FolderB();
        FolderDecorator folderDecoratorB = new FolderDecorator(folderB);
        folderDecoratorB.mkDir();
        folderDecoratorB.rmdir();

        /**
         * 好处：动态扩展类的功能，原始类无需做修改，只需增加一个装饰类即可实现
         * 坏处：相似类的对象创建的过多，比如，扩展的功能很少，你是会选择增加一个装饰类呢，还是在原有类中直接做修改呢？
         *
         * 如果考虑到设计模式的开闭原则：即对扩展开放，对修改关闭，那么牺牲一点内存空间达到类功能的扩展也是很有必要的
         */
    }
}
