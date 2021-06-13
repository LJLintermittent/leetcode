package com.learn.leetcode.utils;

/**
 * Description:
 * date: 2021/4/2 0:49
 * Package: com.learn.leetcode.utils
 *
 * @author 李佳乐
 * @version 1.0
 */
public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(Integer val) {
        this.val = val;
    }

    public TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
