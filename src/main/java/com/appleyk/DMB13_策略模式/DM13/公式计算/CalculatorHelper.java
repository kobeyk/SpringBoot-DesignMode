package com.appleyk.DMB13_策略模式.DM13.公式计算;

/**
 * <p>计算辅助类，主要提取公式中的数数组</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class CalculatorHelper {

    public static double[] getValArray(String formula , String splitChar){

        //记得消除空格
        String array[] = formula.trim().split(splitChar);
        double arrayDouble[] = new double[2];
        arrayDouble[0] = Double.parseDouble(array[0]);
        arrayDouble[1] = Double.parseDouble(array[1]);
        return arrayDouble;

    }

}
