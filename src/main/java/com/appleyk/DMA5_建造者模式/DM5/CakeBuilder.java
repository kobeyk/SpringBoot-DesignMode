package com.appleyk.DMA5_建造者模式.DM5;

/**
 * <p>蛋糕制作器接口，规定制作流程，具体实现过程取决于builder的人</p>
 * <p>除了定义制作流程【工序】外，还需要定义一个根据流程制作好的蛋糕【获取产品】</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:36 2018-11-9
 * @version V.0.1.1
 */
public interface CakeBuilder {

    /**
     * 揉面
     */
    void  knead();

    /**
     * 发酵
     */
    void  ferment();

    /**
     * 烘烤
     * @param minutes 烘烤的分钟数
     */
    void bake(int minutes);

    /**
     * 返回builder后的产品、结果  == 即行为和展示分离，你怎么制作的我不关心，我关心的是，什么时候能让我吃上蛋糕，哈哈
     * @return
     */
    Cake getCake();
}
