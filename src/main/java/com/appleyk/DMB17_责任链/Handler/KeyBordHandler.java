package com.appleyk.DMB17_责任链.Handler;

import java.util.List;

import com.appleyk.DMB17_责任链.DM17.AbstractHandler;
import com.appleyk.DMB17_责任链.DM17.filter.ComputerFilter;
import com.appleyk.DMB17_责任链.DM17.model.Computer;
import com.appleyk.DMB17_责任链.DM17.model.KeyBord;

/**
 * <p>键盘处理事件</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:26 2018-11-7
 * @Version V.1.0.1
 */
public class KeyBordHandler extends AbstractHandler<List<Computer>,ComputerFilter> {

    @Override
    public List<Computer> filter(ComputerFilter filter) {
        List<Computer> computers = this.getData();
        Boolean loadKeyBord = filter.getLoadKeyBord();
        if(loadKeyBord){
            for (Computer computer : computers) {
                KeyBord keyBord = new KeyBord("无线");
                keyBord.setId(idsMaker.nextId());
                keyBord.setName("雷柏键盘");
                computer.setKeyBord(keyBord);
            }
        }
        return  computers;
    }
}
