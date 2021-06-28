package com.appleyk.DMB17_责任链.DM17.query;

import java.util.List;

import org.springframework.stereotype.Service;

import com.appleyk.DMB17_责任链.DM17.AbstractHandler;
import com.appleyk.DMB17_责任链.DM17.filter.ComputerFilter;
import com.appleyk.DMB17_责任链.DM17.model.Computer;
import com.appleyk.DMB17_责任链.Handler.ComputerHandler;
import com.appleyk.DMB17_责任链.Handler.KeyBordHandler;
import com.appleyk.DMB17_责任链.Handler.MonitorHandler;
import com.appleyk.DMB17_责任链.Handler.MouseHandler;

/**
 * <p>使用了任务链的service业务层，实现根据过滤器查询电脑信息</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:41 2018-11-7
 */
@Service
public class ComputerQueryService2 {

    public List<Computer> query(ComputerFilter filter) {

        // 逐个创建任务
        ComputerHandler computerHandler = new ComputerHandler();
        MonitorHandler monitorHandler = new MonitorHandler();
        KeyBordHandler keyBordHandler = new KeyBordHandler();
        MouseHandler mouseHandler = new MouseHandler();

        // 设置任务之间的关系 == 设置任务之间的链条
        computerHandler.setNextHandler(monitorHandler);
        monitorHandler.setNextHandler(keyBordHandler);
        keyBordHandler.setNextHandler(mouseHandler);

        //执行任务链，从第一个任务事件开始执行，最终执行完拿到结果
        List<Computer> computers = (List<Computer>) AbstractHandler.process(computerHandler, filter);
        return computers;
    }
}
