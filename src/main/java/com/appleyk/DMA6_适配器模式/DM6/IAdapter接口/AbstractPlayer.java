package com.appleyk.DMA6_适配器模式.DM6.IAdapter接口;

import com.appleyk.DMA6_适配器模式.DM6.Player;

/**
 * <p>播放器抽象类 == 实现播放接口</p>
 * <p>抽象类中的方法：无需全部实现</p>
 * <p>接口中的方法    ：必须全部实现</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 2018年11月10日 - 下午1:17:34
 * @Version V.1.0.1
 */
public abstract class AbstractPlayer implements Player{
	
	/**
	 * 播放MV == 
	 */
	@Override
	public  void playMVs(){}
	
	/**
	 * 播放音乐 
	 */
    @Override
	public  void playMusics(){}
	
	/**
	 * 播放电影
	 */
    @Override
	public void playMovies(){}
	
	/**
	 * 播放器功能展示抽象方法，子类中必须实现
	 */
	public abstract void show();
}
