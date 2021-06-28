package com.appleyk.DMB15_观察者模式.DM15.任务回调函数;

/**
 * <p>任务监听器接口，主要监听任务是否执行成功、失败等</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 10:46 2021/2/21
 */
public interface IJobListener {

    /**
     * 任务执行成功回调函数（监听成功事件）
     * @param job 任务对象
     */
    void onSuccess(TJob job);

    /**
     * 任务执行异常回调函数（监听失败事件）
     * @param job 任务对象
     * @param throwable 异常对象
     */
    void onFail(TJob job,Throwable throwable);

    /**
     * 任务执行进度监听
     * @param finishedSize 已传输的字节数
     * @param totalSize 总字节数
     */
    void onProgress(long finishedSize,long totalSize);
}
