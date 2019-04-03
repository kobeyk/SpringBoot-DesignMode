package com.appleyk.DMB12_享元模式.DM12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <p>数据源驱动工厂类</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:23 2018-11-21
 * @Version V.1.0.1
 */
public class DbDriverFactory {

    private HashMap<String,MyDbDriver> dbDriverMap ;

    private List<MyDbDriver> dbDrivers = new ArrayList<>();

    public DbDriverFactory(){
        dbDriverMap = new HashMap<>();
    }

    public MyDbDriver getDbDriver(String driverName){

        MyDbDriver dbDriver;
        // 有的话，直接返回驱动对象
        if(dbDriverMap.containsKey(driverName)){
            System.out.println(driverName+"--> 数据源驱动实例已存在，无需再new，直接返回");
            dbDriver = dbDriverMap.get(driverName);
            this.dbDrivers.add(dbDriver);
            return dbDriver;
        }

        dbDriver = new MyDbDriver(driverName);
        this.dbDriverMap.put(driverName,dbDriver ) ;
        this.dbDrivers.add(dbDriver);
        return dbDriver;
    }

    public int size(){
        return dbDriverMap.size();
    }

    public void showConns(){
        this.dbDrivers.forEach(d->d.connection());
    }
}
