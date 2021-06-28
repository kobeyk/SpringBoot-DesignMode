package com.appleyk.DMB15_观察者模式.DM15.任务回调函数;

/**
 * <p>具体的数据传输任务</p>
 *
 * @author appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 10:56 2021/2/21
 */
public class TDataTransferJob extends AJobExecutable{

    private static final long _10M = 1024*1024*10;

    /**
     * 为了简单起见，这个具体的任务执行子类里面就不放东西了
     * 正常情况下，这个类里面会有N多个业务实现或Dao层的类
     * 比如:AXXXService,BXXXService,CXXXDao,DXXXRepo...etc
     */

    public TDataTransferJob(TJob job) {
        super(job);
    }

    @Override
    public void execute(TJob job, IJobListener listener) throws Exception {
        long totalSize = job.getSize();
        long finished = _10M;
        while (finished<totalSize){
            // 每传输10M，回调一下进度函数
            listener.onProgress(finished,totalSize);
            finished+=1024L*1024L*10;
            // 模拟数据传输过程，间隔两秒
            Thread.sleep(2000);
        }
        // 退出while循环，说明最后不满10M，再调用一次完成的进度回调
        listener.onProgress(totalSize,totalSize);
    }
}
