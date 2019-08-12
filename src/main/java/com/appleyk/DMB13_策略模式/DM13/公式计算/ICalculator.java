package com.appleyk.DMB13_策略模式.DM13.公式计算;

/**
 * <p>定义计算接口，提供根据公式（字符串）计算值的方法</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public interface ICalculator {

    /**
     * <p>根据公式字符串，计算得出值</p>
     * @param formula 公式
     * @return 值
     */
    double calculate(String formula);

}
