package com.learn.leetcode.offer;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/7/23 13:59
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer28 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        boolean ans = isSymmetric(root);
        System.out.println(ans);


    }

    /**
     * 对称的二叉树
     */
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root.left, root.right);
    }

    /**
     * 递归函数
     */
    private static boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && helper(left.left, right.right) &&
                helper(left.right, right.left);
    }
}
