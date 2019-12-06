package com.appleyk.DMB11_组合模式;

import com.appleyk.DMB11_组合模式.DM11.TreeNode;
import com.appleyk.DMB11_组合模式.DM11.login.LoginDiagram;

/**
 * <p>组合模式 || 整体部分模式 --测试</p>
 * 组合模式（Composite Pattern），又叫部分整体模式，
 * 是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，
 * 用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * 这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public class CompositeTest {


    public static void paintDiagram(){
        System.out.println("============开始============");
        System.out.println("           /    \\");
        System.out.println("        登录   退出");
        System.out.println("        /  \\   ");
        System.out.println("     首页  失败   ");
        System.out.println("     /  \\   ");
        System.out.println("商品中心 用户中心   ");
        System.out.println("============================");
    }

    public static void main(String[] args) {

        // 登录流程图
        paintDiagram();

        LoginDiagram loginUML = new LoginDiagram("开始");
        // 拿到根节点
        TreeNode root = loginUML.getRoot();

        // 添加一级子节点
        TreeNode loginNode = root.addChildren("登录");
        TreeNode exitNode  = root.addChildren("退出");

        // 添加二级子节点
        TreeNode homeNode = loginNode.addChildren("首页");
        loginNode.addChildren("失败");

        // 添加三级子节点
        homeNode.addChildren("商品中心");
        homeNode.addChildren("用户中心");

        // 遍历登录流程树状结构
        loginUML.traverse(root);
    }
}
