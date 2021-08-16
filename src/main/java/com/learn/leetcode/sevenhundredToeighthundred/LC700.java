package com.learn.leetcode.sevenhundredToeighthundred;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/8/16 12:49
 * Package: com.learn.leetcode.sevenhundredToeighthundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC700 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        TreeNode ans = searchBST(root, 2);

        System.out.println(ans);

    }

    /**
     * 二叉搜索树中的搜索
     */
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    /**
     * 二叉搜索树中的搜索
     */
    public static TreeNode searchBST1(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        TreeNode ans = dfs(root, val);
        return ans;
    }

    public static TreeNode dfs(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val == root.val) {
            return root;
        } else if (val > root.val) {
            return dfs(root.right, val);
        } else if (val < root.val) {
            return dfs(root.left, val);
        }
        return null;
    }
}
