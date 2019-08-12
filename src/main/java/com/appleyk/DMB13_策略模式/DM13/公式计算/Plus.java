package com.appleyk.DMB13_策略模式.DM13.公式计算;

/**
 * <p>加法运算实现加法公式的结果计算</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class Plus implements ICalculator{

    @Override
    public double calculate(String formula) {
        double[] valArray = CalculatorHelper.getValArray(formula, "\\+");
        return valArray[0] + valArray[1];
    }

}
