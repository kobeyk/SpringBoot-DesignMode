package com.appleyk.DMB17_责任链.DM17.filter;

/**
 * <p></p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 2:11 2018-11-6
 * @version V.0.1.1
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
