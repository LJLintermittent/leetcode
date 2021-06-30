package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.TreeNode;

import java.util.*;

/**
 * Description:
 * date: 2021/6/30 21:14
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC145 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        List<Integer> list = postorderTraversal1(root);
        System.out.println(list);
    }

    static List<Integer> list = new ArrayList<>();

    /**
     * 二叉树的后序遍历
     * 递归
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return list;
    }

    public static void helper(TreeNode root) {
        if (root.left != null) {
            helper(root.left);
        }
        if (root.right != null) {
            helper(root.right);
        }
        list.add(root.val);
    }

    /**
     * 二叉树的后序遍历
     * 迭代
     */
    public static List<Integer> postorderTraversal1(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                ans.addFirst(root.val);
                root = root.right;
            } else {
                root = stack.pop();
                root = root.left;
            }
        }
        return ans;
    }

}

