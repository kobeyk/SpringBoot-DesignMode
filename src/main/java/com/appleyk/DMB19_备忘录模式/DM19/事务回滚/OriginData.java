package com.appleyk.DMB19_备忘录模式.DM19.事务回滚;

import java.util.List;

/**
 * <p>原始数据类</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class OriginData {

    private static int num = 0 ;

    private List<Integer> data;

    public OriginData(List<Integer> data) {
        this.data = data;
    }

    public TransitionJournal createJournal(){
        return new TransitionJournal(++num , data);
    }

    public void restoreJournal(TransitionJournal journal){
        this.data = journal.getData();
        num = journal.getLogNum();
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public void addData(Integer val){
        this.data.add(val);
    }

    public void remove(Integer val){
        this.data.remove(val);
    }

    public int getLogNum(){
        return num;
    }

    @Override
    public String toString(){
        return this.data.toString();
    }
}
