package com.appleyk.DMA6_适配器模式.DM6.接口适配器;

/**
 * <p>播放器A  == 只具有播放歌曲的功能</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午1:20:15
 * @version v0.1.1
 */
public class APlayer extends AbstractPlayer{

	/**
	 * 重写父类方法
	 */
	@Override
	public void playMusics() {
		System.out.println("A实现播放音乐的功能");
	}

	@Override
	public void show(){
		System.out.println("=====播放器A功能展示：");
		playMusics();
		playMVs();
		playMovies();
	}
}
