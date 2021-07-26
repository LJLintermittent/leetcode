package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/7/26 10:20
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC104 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(11);
        TreeNode node6 = new TreeNode(12);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        node3.left = node5;
        node5.left = node6;
        int i = maxDepth(root);
        System.out.println(i);
    }

    /**
     * 二叉树的最大深度
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root);
    }


    //计算二叉树中某个节点的高度
    private static int helper(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(helper(root.left), helper(root.right)) + 1;
        }

    }
}
