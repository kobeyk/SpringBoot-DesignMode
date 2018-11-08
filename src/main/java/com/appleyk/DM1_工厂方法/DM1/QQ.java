package com.appleyk.DM1_工厂方法.DM1;

/**
 * <p>QQ社交工具实现聊天接口</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 10:25 2018-11-6
 * @Version V.1.0.1
 */
public class QQ implements Chat {
    @Override
    public void chatting(String seqNo) {
        System.out.println("使用QQ进行聊天 -- " + seqNo);
    }
}