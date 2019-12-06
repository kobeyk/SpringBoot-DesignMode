package com.appleyk.DMB13_策略模式.DM13.公式计算;

/**
 * <p>减法运算实现减法公式的结果计算</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class Sub implements ICalculator{

    @Override
    public double calculate(String formula) {
        double[] valArray = CalculatorHelper.getValArray(formula, "-");
        return valArray[0] - valArray[1];
    }

}
