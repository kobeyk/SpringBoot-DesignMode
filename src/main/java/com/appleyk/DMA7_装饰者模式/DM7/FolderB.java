package com.appleyk.DMA7_装饰者模式.DM7;

/**
 * <p>文件夹B</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午4:15:39
 */
public class FolderB implements IFolder {

    @Override
    public void mkDir() {
        System.out.println("在Linux系统中创建文件夹B");
    }

    @Override
    public void rmdir() {
        System.out.println("在Linux系统中删除文件夹B");
    }

}
