package com.appleyk.DM17_责任链.Handler;

import com.appleyk.DM17_责任链.DM17.AbstractHandler;
import com.appleyk.DM17_责任链.DM17.filter.ComputerFilter;
import com.appleyk.DM17_责任链.DM17.model.Computer;
import com.appleyk.DM17_责任链.DM17.model.Monitor;
import com.appleyk.DM17_责任链.DM17.model.Mouse;

import java.util.List;

/**
 * <p>鼠标处理事件</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:26 2018-11-7
 * @Version V.1.0.1
 */
public class MouseHandler extends AbstractHandler<List<Computer>,ComputerFilter> {

    @Override
    public List<Computer> filter(ComputerFilter filter) {
        List<Computer> computers = this.getData();
        Boolean loadMouse = filter.getLoadMouse();
        if(loadMouse){
            for (Computer computer : computers) {
                Mouse mouse = new Mouse();
                mouse.setId(idsMaker.nextId());
                mouse.setName("罗技鼠标");
                computer.setMouse(mouse);
            }
        }
        return  computers;
    }
}
