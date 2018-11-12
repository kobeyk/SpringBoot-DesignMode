package com.appleyk.DMA7_装饰者模式.DM7;

/**
 * <p>文件夹A</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 2018年11月10日 - 下午4:15:39
 * @Version V.1.0.1
 */
public class FolderA implements Folder{

	@Override
	public void mkDir() {
		System.out.println("在Windows系统中创建文件夹A");
	}

	@Override
	public void rmdir() {
		System.out.println("在Windows系统中删除文件夹A");
	}

}
