package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.TreeNode;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/23 14:39
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC106 {

    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = buildTree(inorder, postorder);
        System.out.println(root);
    }

    /**
     * 从中序与后序遍历序列构造二叉树
     */
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == postorder[postorder.length - 1]) {
                int[] in_left = Arrays.copyOfRange(inorder, 0, i);
                int[] in_right = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                int[] post_left = Arrays.copyOfRange(postorder, 0, i);
                int[] post_right = Arrays.copyOfRange(postorder, i, postorder.length - 1);
                root.left = buildTree(in_left, post_left);
                root.right = buildTree(in_right, post_right);
                break;
            }
        }
        return root;
    }
}
