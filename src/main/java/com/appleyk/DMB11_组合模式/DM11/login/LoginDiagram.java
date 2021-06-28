package com.appleyk.DMB11_组合模式.DM11.login;

import com.appleyk.DMB11_组合模式.DM11.AbstractTree;
import com.appleyk.DMB11_组合模式.DM11.TreeNode;

import java.util.List;

/**
 * <p>登录流程图 == 继承抽象树结构</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:32 2018-11-21
 */
public class LoginDiagram extends AbstractTree {

    public LoginDiagram(String name) {
        super(name);
    }

    @Override
    public void traverse(TreeNode node) {
        if (node.isRoot()) {
            System.out.println("根：" + node.getName() + ",父节点：" + node.getParent());
        } else if (node.isLeaf()) {
            System.out.println("叶子：" + node.getName() + ",父节点：" + node.getParent().getName());
        } else {
            System.out.println("枝：" + node.getName() + ",父节点：" + node.getParent().getName());
        }

        // 递归遍历
        for (TreeNode cNode : node.getChildrens()) {
            traverse(cNode);
        }
    }
}
