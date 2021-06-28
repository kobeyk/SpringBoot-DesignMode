package com.appleyk.DMA7_装饰者模式.DM7;

/**
 * <p>文件夹接口 == 提供两个基础的文件夹操作方法</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午4:12:43
 */
public interface IFolder {

    /**
     * 创建文件夹
     */
    void mkDir();

    /**
     * 删除文件夹
     */
    void rmdir();
}
