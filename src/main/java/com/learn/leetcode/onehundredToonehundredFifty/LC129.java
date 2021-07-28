package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/7/28 9:01
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC129 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        int ans = sumNumbers1(root);
        System.out.println(ans);

    }

    static int res = 0;

    /**
     * 求根节点到叶节点数字之和
     */
    public static int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, 0);
        return res;

    }

    private static void dfs(TreeNode root, int value) {
        if (root == null) {
            return;
        }
        value = value * 10 + root.val;
        if (root.left == null && root.right == null) {
            res = res + value;
            return;
        } else {
            dfs(root.left, value);
            dfs(root.right, value);
        }
        value = value / 10;
    }

    /**
     * 题解
     * 深度优先搜索
     */
    public static int sumNumbers1(TreeNode root) {
        return dfs1(root, 0);
    }

    private static int dfs1(TreeNode root, int parentval) {
        if (root == null) {
            return 0;
        }
        int sum = parentval * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            int left = dfs1(root.left, sum);
            int right = dfs1(root.right, sum);
            return left + right;
        }
    }
}
