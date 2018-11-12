package com.appleyk.DMB17_责任链.DM17.query;

import com.appleyk.DMB17_责任链.DM17.filter.ComputerFilter;
import com.appleyk.DMB17_责任链.DM17.model.Computer;
import com.appleyk.DMB17_责任链.DM17.model.KeyBord;
import com.appleyk.DMB17_责任链.DM17.model.Monitor;
import com.appleyk.DMB17_责任链.DM17.model.Mouse;
import com.appleyk.utils.IdsMaker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * <p>普通service业务层实现根据过滤器查询电脑信息</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:41 2018-11-7
 * @Version V.1.0.1
 */
@Service
public class ComputerQueryService1 {

    private IdsMaker idsMaker = new IdsMaker(1,31);

    public List<Computer> query(ComputerFilter filter){
        List<Computer> computers = getComputers(filter);
        loadMonitors(computers,filter);
        loadKeyBords(computers,filter);
        loadMouses(computers,filter);
        return computers;
    }

    /**
     * 根据电脑查询过滤器 == 拿到对应的电脑实体数据
     * @param filter
     * @return
     */
    private List<Computer> getComputers(ComputerFilter filter){

        // 由于是模拟数据，不要在乎实现细节 == 数据都是临时拼凑的,正常应该是从数据库中拿
        List<Computer> computers = new ArrayList<>();
        HashSet<Long> ids = filter.getIds();
        for (Long id : ids) {
            Computer computer = new Computer("苹果公司",13488.00);
            computer.setId(id);
            computer.setName("Apple MacBook Pro 13.3英寸笔记本电脑 深空灰色 2018新款 -- "+id);
            computers.add(computer);
        }
        return computers;
    }


    /**
     * 根据查询过滤器加载电脑显示器
     * @param computers 电脑集合
     * @param filter 电脑查询过滤器
     */
    private void loadMonitors(List<Computer> computers ,ComputerFilter filter){
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
    }


    /**
     * 根据查询过滤器加载电脑键盘
     * @param computers 电脑集合
     * @param filter 电脑查询过滤器
     */
    private void loadKeyBords(List<Computer> computers ,ComputerFilter filter){
        Boolean loadKeyBord = filter.getLoadKeyBord();
        if(loadKeyBord){
            for (Computer computer : computers) {
                KeyBord keyBord = new KeyBord("无线");
                keyBord.setId(idsMaker.nextId());
                keyBord.setName("雷柏键盘");
                computer.setKeyBord(keyBord);
            }
        }
    }


    /**
     * 根据查询过滤器加载电脑鼠标
     * @param computers 电脑集合
     * @param filter 电脑查询过滤器
     */
    private void loadMouses(List<Computer> computers ,ComputerFilter filter){
        Boolean loadMouse = filter.getLoadMouse();
        if(loadMouse){
            for (Computer computer : computers) {
                Mouse mouse = new Mouse();
                mouse.setId(idsMaker.nextId());
                mouse.setName("罗技鼠标");
                computer.setMouse(mouse);
            }
        }
    }
}
