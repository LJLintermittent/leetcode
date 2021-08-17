package com.learn.leetcode.fivehundredToSixhundred;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/8/17 10:35
 * Package: com.learn.leetcode.fivehundredToSixhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC572 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        TreeNode subRoot = new TreeNode(4);
        TreeNode node22 = new TreeNode(1);
        TreeNode node33 = new TreeNode(2);
        subRoot.left = node22;
        subRoot.right = node33;

        boolean ans = isSubtree(root, subRoot);
        System.out.println(ans);

    }

    /**
     * 另一棵树的子树
     */
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        return dfs(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean dfs(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val != subRoot.val) {
            return false;
        }
        return dfs(root.left, subRoot.left) && dfs(root.right, subRoot.right);
    }
}
