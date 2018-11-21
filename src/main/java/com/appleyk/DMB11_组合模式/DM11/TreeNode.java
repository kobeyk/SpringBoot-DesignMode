package com.appleyk.DMB11_组合模式.DM11;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>树节点</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:23 2018-11-21
 * @Version V.1.0.1
 */
public class TreeNode {

    /**
     * 节点名称
     */
    private String name;

    /**
     * 节点的父节点
     */
    private TreeNode parent;

    /**
     * 节点的子节点
     */
    private List<TreeNode> childrens = new ArrayList<>();

    public TreeNode(){}

    public TreeNode(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public List<TreeNode> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<TreeNode> childrens) {
        this.childrens = childrens;
    }

    public void addChildren(TreeNode node){
        // 别忘设置节点的父
        node.setParent(this);
        this.childrens.add(node);
    }

    public TreeNode addChildren(String node){
        TreeNode cNode = new TreeNode(node);
        // 别忘设置节点的父
        cNode.setParent(this);
        this.childrens.add(cNode);
        return cNode;
    }

    public void removeChildren(TreeNode node){
        this.childrens.remove(node);
    }

    /**
     * 是否是叶子
     */
    public boolean isLeaf(){
         return  !(this.childrens.size()>0) && (this.parent != null);
    }

    /**
     * 是否有父节点 == 如果没有，就是根节点
     * @return
     */
    public boolean hasParent(){return !(this.parent == null);}

    /**
     * 根节点没有父节点
     * @return
     */
    public boolean isRoot(){return  this.parent == null;}
}
