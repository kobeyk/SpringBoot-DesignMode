package com.appleyk.DMB18_命令模式.DM18.传统模式;

/**
 * <p>命令接收者</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class Receiver {

    /**
     *                  接收者，真正执行命令的对象。
     * 任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能即可
     */
    private String name ;

    public Receiver(){

    }

    public Receiver(String name){
        this.name = name ;
    }

    public void action(String command){
        System.out.println("接收者："+name+",命令【"+command+"】收到！");
    }

}
