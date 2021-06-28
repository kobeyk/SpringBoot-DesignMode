package com.appleyk.DMB14_模板方法.DM14.父类固定算法步骤;

/**
 * <p>减法运算</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 */
public class Sub extends AbstractCalculator {

    @Override
    protected double calculate(double numA, double numB) {
        return numA - numB;
    }

}
