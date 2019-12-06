package com.appleyk.DMB18_命令模式.DM18.传统模式;

/**
 * <p>调用者，命令发起者</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class Invoker {

    /**
     * 发号施令的人名字或者下达命令的人
     */
    private String name ;

    /**
     * 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象
     */
    private ICommand command ;

    public Invoker(ICommand command){
        this.command = command ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void action(){
        System.out.println("命令下达者："+name);
        command.execute();
    }

}
