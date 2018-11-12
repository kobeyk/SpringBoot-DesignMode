package com.appleyk.DMA5_建造者模式.DM5;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>蛋糕类</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:45 2018-11-9
 * @Version V.1.0.1
 */
public class Cake {

    /**
     * 制作一个蛋糕所需要的所有工序【或一个产品所有组成部分的实现】
     */
    private List<String> parts = new ArrayList<>();

    public Cake(){}

    public List<String> getParts() {
        return parts;
    }

    public void setParts(List<String> parts) {
        this.parts = parts;
    }

    public void addProcess(String process){
        this.parts.add(process);
    }

    public void show(){
        System.out.println("先生你好，香喷喷的蛋糕已为你准备好了，它的制作流程如下：");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
