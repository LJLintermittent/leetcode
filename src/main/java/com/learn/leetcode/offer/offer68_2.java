package com.learn.leetcode.offer;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/8/28 13:23
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer68_2 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;
        TreeNode ans = lowestCommonAncestor(root, node1, node8);
        System.out.println(ans);
    }

    /**
     * 剑指 Offer 68 - II. 二叉树的最近公共祖先
     */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // p,q一个在左一个在右
        if (left != null && right != null) {
            return root;
        }
        // p,q都在左
        if (left != null) {
            return left;
        }
        // p,q都在右
        if (right != null) {
            return right;
        }
        return null;
    }
}
