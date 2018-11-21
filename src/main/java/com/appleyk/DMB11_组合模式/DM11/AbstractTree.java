package com.appleyk.DMB11_组合模式.DM11;

/**
 * <p>树</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:23 2018-11-21
 * @Version V.1.0.1
 */
public abstract class AbstractTree {

    private  TreeNode root = null;

    public AbstractTree(){
    }

    public TreeNode getRoot() {
        return root;
    }

    public AbstractTree(String name){
        root = new TreeNode(name);
    }

    /**
     * 抽象方法 == 树节点遍历，由具体的子类实现
     */
    public abstract void traverse(TreeNode node);
}
