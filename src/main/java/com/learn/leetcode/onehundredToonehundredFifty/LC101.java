package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/7/23 14:15
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC101 {

    public static void main(String[] args) {

    }

    /**
     * 对称二叉树
     */
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root.left, root.right);
    }

    private static boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && helper(left.left, right.right)
                && helper(left.right, right.left);
    }
}
