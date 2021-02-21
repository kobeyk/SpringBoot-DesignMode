package com.appleyk.DMB15_观察者模式.DM15.任务回调函数;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * <p>任务对象，为简单起见，就搞几个字段意思下，大家明白就行</p>
 *
 * @author appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 10:36 2021/2/21
 */
@Data
@Builder  // lombok插件记得一定要在idea中进行安装，这个构建器注解用的很嗨皮
@AllArgsConstructor
public class TJob {

    /**任务ID*/
    private Long id;

    /**任务名称*/
    private String name;

    /**假设为任务要传输的总数据量的字节大小*/
    private Long size;

    /**0:待执行 1：执行成功 -1:执行失败*/
    private int status;
}
