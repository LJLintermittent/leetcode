package com.learn.leetcode.fivehundredToSixhundred;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/7/21 22:52
 * Package: com.learn.leetcode.fivehundredToSixhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC543 {

    int max = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.left = node1;
        LC543 lc543 = new LC543();
        int i = lc543.diameterOfBinaryTree1(root);
        System.out.println(i);
    }

    /**
     * 二叉树的直径
     * 题解
     */
    public int diameterOfBinaryTree1(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }


    /**
     * 二叉树的直径
     */
    public static int diameterOfBinaryTree(TreeNode root) {
        TreeNode originRoot = root;
        if (root == null) {
            return 0;
        }
        int i = 0;
        if (root.left == null) {
            while (root.right != null) {
                root = root.right;
                i = i + 1;
            }
            while (root.left != null) {
                root = root.left;
                i = i + 1;
            }
            return i;
        }
        if (root.right == null) {
            while (root.left != null) {
                root = root.left;
                i = i + 1;
            }
            while (root.right != null) {
                root = root.right;
                i = i + 1;
            }
            return i;
        }
        while (root.left != null) {
            root = root.left;
            i = i + 1;
        }
        while (root.right != null) {
            root = root.right;
            i = i + 1;
        }
        root = originRoot;
        int j = 0;
        while (root.right != null) {
            root = root.right;
            j = j + 1;
        }
        while (root.left != null) {
            root = root.left;
            j = j + 1;
        }


        return i + j;
    }
}
