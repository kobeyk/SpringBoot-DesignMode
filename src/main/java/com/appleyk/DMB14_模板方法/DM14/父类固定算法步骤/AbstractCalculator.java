package com.appleyk.DMB14_模板方法.DM14.父类固定算法步骤;

/**
 * <p>定义抽象算法类</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 */
public abstract class AbstractCalculator {

    public final double calculate(String formula, String splitChar) {
        // 1、第一步，先根据计算公式和分隔符，拿到要计算的数值（假设这个是核心，不对外公布）
        double[] splitArry = split(formula, splitChar);
        // 2、第二步，各个算法类代表发个言吧（默认不发言的，一律按父类说的来）
        hookSay();
        // 3、第三步，话说完了，各个算法（子）类开始干活吧（这时候别再指望父类帮你默认实现了，休想！）
        return calculate(splitArry[0], splitArry[1]);
    }


    /**
     * <p>根据字符分割公式，提取double数组</p>
     *
     * @param formula   计算公式
     * @param splitChar 分隔字符
     * @return double数组
     */
    private double[] split(String formula, String splitChar) {
        String array[] = formula.trim().split(splitChar);
        double arrayDouble[] = new double[2];
        arrayDouble[0] = Double.parseDouble(array[0]);
        arrayDouble[1] = Double.parseDouble(array[1]);
        return arrayDouble;
    }

    /**
     * <p>公开（钩子）方法，子类和父类进行信息交互，子类可以使用默认的父类方法，也可以重写改方法</p>
     */
    public void hookSay() {
        System.out.println("父类说：算法步骤的顺序我已经定好了，尔等子类照着做就行！");
    }

    /**
     * <p>根据a和b的值计算结果，这个必须由子类来实现，父类帮不了了</p>
     *
     * @param numA 第一个数字
     * @param numB 第二个数字
     * @return 两个数字计算的结果
     */
    protected abstract double calculate(double numA, double numB);

}
