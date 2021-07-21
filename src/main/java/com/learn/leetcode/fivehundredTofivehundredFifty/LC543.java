package com.learn.leetcode.fivehundredTofivehundredFifty;

import com.learn.leetcode.utils.ListNode;
import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/7/21 22:52
 * Package: com.learn.leetcode.fivehundredTofivehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC543 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        root.left = node1;
        node1.right = node2;
        node2.left = node3;


        int i = diameterOfBinaryTree(root);
        System.out.println(i);
    }

    /**
     * 题解
     */


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
