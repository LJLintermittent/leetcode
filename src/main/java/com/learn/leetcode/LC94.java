package com.learn.leetcode;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/4/2 1:02
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
public class LC94 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        LC94 lc94 = new LC94();
        List<Integer> list = lc94.inorderTraversal(root);
        System.out.println(list);

    }

    /**
     * *************************二叉树的中序遍历
     * 递归法
     *
     * @param root 根节点
     * @return 返回遍历结果的集合
     */
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return list;
    }

    public void helper(TreeNode root) {
        if (root.left != null) {
            helper(root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            helper(root.right);
        }
    }
}
