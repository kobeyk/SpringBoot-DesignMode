package com.appleyk.DM17_责任链.DM17.filter;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * <p>抽象过滤器</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 2:11 2018-11-6
 * @Version V.1.0.1
 */
public abstract  class AbstractFilter {

    /**
     * 根据ids查询
     */
    private HashSet<Long> ids = new HashSet<>();

    /**
     * 根据names查询
     */
    private HashSet<String> names = new HashSet<>();

    private Integer pageNum = 1;
    private Integer pageSize = 10;

    public HashSet<Long> getIds() {
        return ids;
    }

    public void setIds(HashSet<Long> ids) {
        this.ids = ids;
    }

    public void addIds(Long id){
        this.ids.add(id);
    }

    public HashSet<String> getNames() {
        return names;
    }

    public void setNames(HashSet<String> names) {
        this.names = names;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
