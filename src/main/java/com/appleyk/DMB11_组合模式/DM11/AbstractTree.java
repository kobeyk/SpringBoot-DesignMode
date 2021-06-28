package com.appleyk.DMB11_组合模式.DM11;

/**
 * <p>树</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:23 2018-11-21
 */
public abstract class AbstractTree {

    private TreeNode root = null;

    public TreeNode getRoot() {
        return root;
    }

    public AbstractTree(String name) {
        root = new TreeNode(name);
    }

    /**
     * 抽象方法 == 树节点遍历，由具体的子类实现
     */
    public abstract void traverse(TreeNode node);
}
