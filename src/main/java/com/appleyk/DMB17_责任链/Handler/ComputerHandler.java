package com.appleyk.DMB17_责任链.Handler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.appleyk.DMB17_责任链.DM17.AbstractHandler;
import com.appleyk.DMB17_责任链.DM17.filter.ComputerFilter;
import com.appleyk.DMB17_责任链.DM17.model.Computer;

/**
 * <p>电脑处理事件</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:26 2018-11-7
 * @Version V.1.0.1
 */
public class ComputerHandler extends AbstractHandler<List<Computer>,ComputerFilter> {


    @Override
    public List<Computer> filter(ComputerFilter filter) {
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
}
