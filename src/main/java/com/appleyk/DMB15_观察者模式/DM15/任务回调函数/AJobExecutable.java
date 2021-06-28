package com.appleyk.DMB15_观察者模式.DM15.任务回调函数;

import java.util.Optional;

/**
 * <p>抽象一个可执行的任务类，主要就是把任务执行的方法进行抽取封装（其中用到了模板方法）</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 10:44 2021/2/21
 */
public abstract class AJobExecutable {

    // 任务对象
    private final TJob job;

    public AJobExecutable(TJob job) {
        this.job = job;
    }

    // 这个方法后面留给单独的任务执行线程来调用
    public void execute(IJobListener listener){
        try {
            execute(job,listener);
            // lambda判断监听器是否不空，不空则执行对应的事件回调
            Optional.ofNullable(listener).ifPresent(l->l.onSuccess(job));
        } catch (Exception e){
            Optional.ofNullable(listener).ifPresent(l->l.onFail(job,e.getCause()));
        }
    }

    // 这个方法留给具体的执行任务来实现（必须实现）
    public abstract void execute(TJob job,IJobListener listener) throws Exception;
}
