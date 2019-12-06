package com.appleyk.DMA4_原型模式.DM4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * <p>作业枚举类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:01 2018-11-8
 * @version V.0.1.1
 */
public enum WorkTypeEnum {

    /**
     * 枚举对象
     */
    YUWEN("语文",0),
    SHUXUE("数学",1),
    YINGYU("英语",2),
    WULI("物理",3),
    HUAXUE("化学",4),
    SHENGWU("生物",5);



    private final  String name ;
    private final  Integer value;

    /**
     * 枚举构造器
     * @param name 作业类型名称
     * @param value 作业类型值
     */
    WorkTypeEnum(String name,Integer value){
        this.name = name;
        this.value = value;
    }


    /**
     * 通过name获取对应的枚举对象
     * @param name 类型名称
     * @return
     */
    public static WorkTypeEnum getEnum(String name){
        for(WorkTypeEnum typeEnum : WorkTypeEnum.values()){
            if(name.equals(typeEnum.getName())){
                return  typeEnum;
            }
        }
        return  null;
    }

    /**
     * 通过value获取对应的枚举对象
     * @param value 类型值
     * @return
     */
    @JsonCreator
    public static WorkTypeEnum getEnum(Integer value){
        for(WorkTypeEnum typeEnum : WorkTypeEnum.values()){
            if(value.equals(typeEnum.getValue())){
                return  typeEnum;
            }
        }
        return  null;
    }


    public String getName() {
        return name;
    }

    @JsonValue
    public Integer getValue() {
        return value;
    }
}
