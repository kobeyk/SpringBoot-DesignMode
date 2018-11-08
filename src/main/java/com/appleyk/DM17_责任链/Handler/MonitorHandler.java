package com.appleyk.DM17_责任链.Handler;

import com.appleyk.DM17_责任链.DM17.AbstractHandler;
import com.appleyk.DM17_责任链.DM17.filter.ComputerFilter;
import com.appleyk.DM17_责任链.DM17.model.Computer;
import com.appleyk.DM17_责任链.DM17.model.Monitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * <p>显示器处理事件</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:26 2018-11-7
 * @Version V.1.0.1
 */
public class MonitorHandler extends AbstractHandler<List<Computer>,ComputerFilter> {

    @Override
    public List<Computer> filter(ComputerFilter filter) {
        List<Computer> computers = this.getData();
        Boolean loadMonitor = filter.getLoadMonitor();
        if(loadMonitor){
            for (Computer computer : computers) {
                Monitor monitor = new Monitor();
                monitor.setId(idsMaker.nextId());
                monitor.setSize(23);
                monitor.setName("三星显示器");
                computer.setMonitor(monitor);
            }
        }
        return  computers;
    }
}
