package com.appleyk.DMB15_观察者模式.DM15.任务回调函数;

/**
 * <p>任务执行线程</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 11:32 2021/2/21
 */
public class TJobRunner implements Runnable{

    private final AJobExecutable job;
    private final IJobListener listener;

    public TJobRunner(AJobExecutable job, IJobListener listener) {
        this.job = job;
        this.listener = listener;
    }

    @Override
    public void run() {
        job.execute(listener);
    }
}
