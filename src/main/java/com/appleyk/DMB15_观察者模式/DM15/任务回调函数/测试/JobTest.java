package com.appleyk.DMB15_观察者模式.DM15.任务回调函数.测试;

import com.appleyk.DMB15_观察者模式.DM15.任务回调函数.IJobListener;
import com.appleyk.DMB15_观察者模式.DM15.任务回调函数.TDataTransferJob;
import com.appleyk.DMB15_观察者模式.DM15.任务回调函数.TJob;
import com.appleyk.DMB15_观察者模式.DM15.任务回调函数.TJobRunner;

import java.text.NumberFormat;

public class JobTest {
    public static void main(String[] args) throws Exception{

        TJob job = TJob.builder().id(1001L)
                .name("数据传输任务（50M）").size(1024L * 1024L * 50).build();
        System.out.println("任务名称："+job.getName()+"传输结束，任务状态："+job.getStatus());
        System.out.println("======= 数据开始传输 =======");
        Thread t1 = new Thread(new TJobRunner(new TDataTransferJob(job), new IJobListener() {
            @Override
            public void onSuccess(TJob job) {
                job.setStatus(1);
                System.out.println("======= 数据传输完毕 =======");
            }

            @Override
            public void onFail(TJob job, Throwable throwable) {
                job.setStatus(-1);
                System.out.println("数据传输异常：" + throwable.getMessage());
            }

            @Override
            public void onProgress(long finishedSize, long totalSize) {
                NumberFormat numberFormat = NumberFormat.getInstance();
                numberFormat.setMaximumFractionDigits(2);
                String percent = numberFormat.format((float) finishedSize / (float) totalSize * 100);
                System.out.printf("已传输：%d，当前进度：%s%s\n",finishedSize,percent,"%");
            }
        }));
        t1.start();
        t1.join();
        System.out.println("任务名称："+job.getName()+"传输结束，任务状态："+job.getStatus());
    }
}
