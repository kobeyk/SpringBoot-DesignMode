package com.appleyk.DMB19_备忘录模式.DM19.事务回滚;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>事务日志类</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class TransitionJournal {

    /**
     * 日志序号
     */
    private Integer logNum ;

    /**
     * 假设数据是存进数据库的
     */
    private List<Integer> data = new ArrayList<>();

    public TransitionJournal(Integer logNum , List<Integer> data) {
        this.logNum = logNum;
        if(data != null && data.size() > 0){
            this.data.addAll(data);
        }
    }

    public Integer getLogNum() {
        return logNum;
    }

    public void setLogNum(Integer logNum) {
        this.logNum = logNum;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
