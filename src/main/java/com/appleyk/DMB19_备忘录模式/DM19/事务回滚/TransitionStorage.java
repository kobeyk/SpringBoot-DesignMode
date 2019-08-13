package com.appleyk.DMB19_备忘录模式.DM19.事务回滚;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>事务存储类，每一个事务的提交日志都存储在该类中</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class TransitionStorage {

    private Map<Integer , TransitionJournal> logMap = new HashMap<>();

    public TransitionStorage(TransitionJournal journal) {
        logMap.put(journal.getLogNum(),journal);
    }

    /**
     * <p>根据事务日志ID获取对应的事务日志</p>
     * @param logNum  事务日志ID
     * @return 事务日志对象
     */
    public TransitionJournal getLogMap(Integer logNum) {
        return logMap.get(logNum);
    }

    public void setLogMap(Map<Integer, TransitionJournal> logMap) {
        this.logMap = logMap;
    }

    public void backup(TransitionJournal journal){
        this.logMap.put(journal.getLogNum(),journal);
    }
}
