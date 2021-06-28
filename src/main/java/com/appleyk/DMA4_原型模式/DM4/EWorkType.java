package com.appleyk.DMA4_原型模式.DM4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * <p>作业枚举类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:01 2018-11-8
 * @version v0.1.1
 */
public enum EWorkType {

    YU_WEN("语文",0),
    SHU_XUE("数学",1),
    YING_YU("英语",2),
    WU_LI("物理",3),
    HUA_XUE("化学",4),
    SHENG_WU("生物",5);

    private final  String name ;
    private final  Integer value;

    /**
     * 枚举构造器
     * @param name 作业类型名称
     * @param value 作业类型值
     */
    EWorkType(String name, Integer value){
        this.name = name;
        this.value = value;
    }


    /**
     * 通过name获取对应的枚举对象
     * @param name 类型名称
     * @return
     */
    public static EWorkType getEnum(String name){
        for(EWorkType typeEnum : EWorkType.values()){
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
    public static EWorkType getEnum(Integer value){
        for(EWorkType typeEnum : EWorkType.values()){
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
