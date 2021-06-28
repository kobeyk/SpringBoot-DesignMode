package com.appleyk.DMB17_责任链.Handler;

import java.util.List;

import com.appleyk.DMB17_责任链.DM17.AbstractHandler;
import com.appleyk.DMB17_责任链.DM17.filter.ComputerFilter;
import com.appleyk.DMB17_责任链.DM17.model.Computer;
import com.appleyk.DMB17_责任链.DM17.model.Mouse;

/**
 * <p>鼠标处理事件</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:26 2018-11-7
 */
public class MouseHandler extends AbstractHandler<List<Computer>, ComputerFilter> {

    @Override
    public List<Computer> filter(ComputerFilter filter) {
        List<Computer> computers = this.getData();
        Boolean loadMouse = filter.getLoadMouse();
        if (loadMouse) {
            for (Computer computer : computers) {
                Mouse mouse = new Mouse();
                mouse.setId(idsMaker.nextId());
                mouse.setName("罗技鼠标");
                computer.setMouse(mouse);
            }
        }
        return computers;
    }
}
