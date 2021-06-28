package com.appleyk.DMA6_适配器模式.DM6;

/**
 * <p>MP3播放器  == 功能单一，只播放歌曲</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 上午11:48:48
 */
public class Mp3 {

    private String name = "";

    public Mp3() {
    }

    public Mp3(String name) {
        this.name = name;
    }

    /**
     * 播放歌曲 == 凡是能播放音乐的设备，都要适配Mp3类的这个方法
     * 如果你说鼠标能播放歌曲，Ok，也不是做不到，哈哈
     */
    public void playMusics() {
        System.out.println("Mp3 -- " + this.name + "播放歌曲");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
