package com.appleyk.DMA4_原型模式.DM4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * <p>性别枚举类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:16 2018-11-8
 * @version V.0.1.1
 */
public enum SexEnum {

    /**
     * 枚举对象
     */
    MALE("男",0),
    FEMALE("女",1);


    private final  String name ;
    private final  Integer value;

    /**
     * 枚举构造器
     * @param name 性别名称
     * @param value 性别值
     */
    SexEnum(String name,Integer value){
        this.name = name;
        this.value = value;
    }


    /**
     * 通过name获取对应的枚举对象
     * @param name 类型名称
     * @return
     */
    public static SexEnum getEnum(String name){
        for(SexEnum sexEnum : SexEnum.values()){
            if(name.equals(sexEnum.getName())){
                return  sexEnum;
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
    public static SexEnum getEnum(Integer value){
        for(SexEnum sexEnum : SexEnum.values()){
            if(value.equals(sexEnum.getValue())){
                return  sexEnum;
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
