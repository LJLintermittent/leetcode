package com.learn.leetcode.onehundredToonehundredFifty;

import com.google.common.collect.Lists;
import com.learn.leetcode.utils.TreeNode;

import java.util.List;

/**
 * Description:
 * date: 2021/6/30 21:31
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC144 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.right = node3;
        node2.left = node4;
        List<Integer> list = preorderTraversal(root);
        System.out.println(list);

    }

    /**
     * 二叉树的前序遍历
     */
    static List<Integer> list = Lists.newArrayList();

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root!=null){
            helper(root);
        }
        return list;
    }

    public static void helper(TreeNode root) {
        list.add(root.val);
        if (root.left != null) {
            helper(root.left);
        }
        if (root.right != null) {
            helper(root.right);
        }
    }
}
