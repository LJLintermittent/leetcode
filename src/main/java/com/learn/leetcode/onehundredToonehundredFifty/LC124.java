package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/7/26 17:46
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC124 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        int i = maxPathSum(root);
        System.out.println(i);

    }


    static int max = Integer.MIN_VALUE;

    /**
     * 二叉树中的最大路径和
     */
    public static int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return max;
    }

    private static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //与0比较是因为有可能为负数，那直接置为0
        //计算左边分支最大值
        int leftmax = Math.max(0, dfs(root.left));
        //计算右边分支最大值
        int rightmax = Math.max(0, dfs(root.right));
        // left -> root -> right 作为路径与历史最大值比较
        max = Math.max(max, root.val + leftmax + rightmax);
        //返回经过root的单边的最大分支给当前root的父节点计算使用
        return root.val + Math.max(leftmax, rightmax);
    }

}
