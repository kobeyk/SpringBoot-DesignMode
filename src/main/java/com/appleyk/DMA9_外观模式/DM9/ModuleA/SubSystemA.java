package com.appleyk.DMA9_外观模式.DM9.ModuleA;

/**
 * <p>模块A下的子系统A</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 9:00 2018-11-12
 * @version V.0.1.1
 */
public class SubSystemA {

    public void initSystem(){
        System.out.println("人工智能系统正在启动，请您稍等.... =====>"+this);
        for(int i = 0; i < 3; i++){
            try {
                System.out.println("等待"+(i+1)+"s");
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                System.out.println(ex.getClass()+","+ ex.getMessage());
            }
        }
    }
    @Override
    public String toString(){
        return "人工智能系统，模块A，子系统A，主要负责启动系统";
    }
}
