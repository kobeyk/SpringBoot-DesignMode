package com.appleyk.DMA6_适配器模式.DM6;

/**
 * <p>播放器接口 </p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 上午11:44:46
 */
public interface IPlayer {

    /**
     * 播放MV
     */
    void playMVs();

    /**
     * 播放音乐 == 与Mp3播放音乐的功能【方法】名称一致
     */
    void playMusics();

    /**
     * 播放电影
     */
    void playMovies();

}
