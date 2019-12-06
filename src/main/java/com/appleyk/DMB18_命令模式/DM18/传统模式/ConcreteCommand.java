package com.appleyk.DMB18_命令模式.DM18.传统模式;

/**
 * <p>具体命令类，实现命令接口，同时持有接收者，借接收者之手执行相应的命令</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class ConcreteCommand implements ICommand{

    private String command ;

    /**
     * 当然，这里是一个接收者，实际对命令的发出者来说，他并不知道谁会接收命令并执行
     */
    private Receiver receiver ;

    public ConcreteCommand(Receiver receiver , String command){
        this.receiver = receiver ;
        this.command = command ;
    }

    @Override
    public void execute() {
        receiver.action(command);
    }
}
