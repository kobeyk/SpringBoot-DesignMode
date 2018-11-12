package com.appleyk.DMA9_外观模式.DMA9;

import com.appleyk.DMA9_外观模式.DMA9.ModuleA.FacadeA;
import com.appleyk.DMA9_外观模式.DMA9.ModuleB.FacadeB;

/**
 * <p>外观模式AB == 聚合子模块A和子模块B的功能，降低客户端使用模块A和模块B的复杂度</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 8:59 2018-11-12
 * @Version V.1.0.1
 */
public class FacadeAB {

    private FacadeA facadeA;
    private FacadeB facadeB;

    public  FacadeAB(){
        facadeA = new FacadeA();
        facadeB = new FacadeB();
    }
    public void  startSystem(){
        facadeA.initialize();
        facadeB.work();
    }
}
