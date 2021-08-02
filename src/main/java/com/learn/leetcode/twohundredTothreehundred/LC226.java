package com.learn.leetcode.twohundredTothreehundred;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/7/15 19:12
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC226 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        TreeNode ans = invertTree(root);
        System.out.println(ans);
    }

    /**
     * 翻转二叉树
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        //从叶子节点开始翻转
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
