package com.appleyk.DMA7_装饰者模式.DM7;

/**
 * <p>文件夹装饰类</p>
 * <p>扩展文件夹创建和删除的类 == 在创建和删除前后进行相应的操作</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午4:18:36
 * @version V.0.1.1
 */
public class FolderDecorator implements Folder{

	private Folder folder;
	
	public FolderDecorator(Folder folder) {
		this.folder = folder;
	}
	
	@Override
	public void mkDir() {
		System.out.println("-- 检查下，文件夹名称是否含有非法字符 --");
		this.folder.mkDir();
		System.out.println("-- 创建过程结束，提示用户文件夹是否创建成功 -- ");
	}

	@Override
	public void rmdir() {
		System.out.println("-- 检查下，文件夹是否为空，空的话直接删除，非空的话，提示下用户是否依然删除 --");
		this.folder.rmdir();
		System.out.println("-- 删除过程结束，提示用户文件夹是否删除成功 --");
	}

	/**
	 * @return the folder
	 */
	public Folder getFolder() {
		return folder;
	}

	/**
	 * @param folder the folder to set
	 */
	public void setFolder(Folder folder) {
		this.folder = folder;
	}
	
}
