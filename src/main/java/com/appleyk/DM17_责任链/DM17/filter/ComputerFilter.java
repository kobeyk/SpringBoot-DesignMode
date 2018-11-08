package com.appleyk.DM17_责任链.DM17.filter;

import com.appleyk.DM17_责任链.DM17.model.AbstractObject;

/**
 * <p></p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 2:11 2018-11-6
 * @Version V.1.0.1
 */
public class ComputerFilter extends AbstractFilter {

    /**
     * 是否加载显示器
     */
    private Boolean loadMonitor = false;

    /**
     * 是否加载键盘
     */
    private Boolean loadKeyBord = false;

    /**
     * 是否加载鼠标
     */
    private Boolean loadMouse = false;

    public ComputerFilter(){

    }

    public Boolean getLoadMonitor() {
        return loadMonitor;
    }

    public void setLoadMonitor(Boolean loadMonitor) {
        this.loadMonitor = loadMonitor;
    }

    public Boolean getLoadKeyBord() {
        return loadKeyBord;
    }

    public void setLoadKeyBord(Boolean loadKeyBord) {
        this.loadKeyBord = loadKeyBord;
    }

    public Boolean getLoadMouse() {
        return loadMouse;
    }

    public void setLoadMouse(Boolean loadMouse) {
        this.loadMouse = loadMouse;
    }
}
