package com.appleyk.DMA6_适配器模式.DM6.类适配器;

import com.appleyk.DMA6_适配器模式.DM6.Mp3;
import com.appleyk.DMA6_适配器模式.DM6.IPlayer;

/**
 * <p>
 *     适配器 == QQ播放器，将Mp3播放音乐的功能直接"窃取"到QQ播放器里
 *     即QQ播放器无需再实现播放接口中的播放音乐的功能了
 * </p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 上午11:56:24
 * @version v0.1.1
 */
public class QQPlayer extends Mp3 implements IPlayer {

	@Override
	public void playMVs() {
		System.out.println("QQ播放器实现播放MV功能");	
	}
	
	@Override
	public void playMovies() {
		System.out.println("QQ播放器实现播放电影功能");			
	}

}
