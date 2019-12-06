package com.appleyk.DMA6_适配器模式.DM6.OAdapter对象;

import com.appleyk.DMA6_适配器模式.DM6.Mp3;
import com.appleyk.DMA6_适配器模式.DM6.Player;

/**
 * <p>适配器 == 暴风音影播放器，将Mp3播放音乐的功能直接扩展到播放器里，即无需再实现播放器播放音乐的功能了</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午12:59:59
 * @version V.0.1.1
 */
public class BaoFengPlayer implements Player{

	/**
	 * 唯一不同于QQ适配器的地方就是，暴风适配器里面可以创建Mp3的实例
	 * 即可以实现不同原对象播放音乐的方法，无需再继承Mp3类
	 */
	private Mp3 mp3;
	
    public BaoFengPlayer(Mp3 mp3) {
		this.mp3 = mp3;
	}
	
	@Override
	public void playMVs() {
		System.out.println("暴风影音实现播放MV功能");
	}


	@Override
	public void playMusics() {
		this.mp3.playMusics();		
	}


	@Override
	public void playMovies() {
		System.out.println("暴风影音实现播放电影功能");		
	}

	/**
	 * @return the mp3
	 */
	public Mp3 getMp3() {
		return mp3;
	}

	/**
	 * @param mp3 the mp3 to set
	 */
	public void setMp3(Mp3 mp3) {
		this.mp3 = mp3;
	}

	
}
