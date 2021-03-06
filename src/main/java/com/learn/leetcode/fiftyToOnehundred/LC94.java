package com.learn.leetcode.fiftyToOnehundred;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * date: 2021/4/2 1:02
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LC94 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        LC94 lc94 = new LC94();
        List<Integer> list = lc94.inorderTraversa1l(root);
        System.out.println(list);

    }

    /**
     * 二叉树的中序遍历
     * 递归法
     */
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return list;
    }

    public void helper(TreeNode root) {
        if (root.left != null) {
            helper(root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            helper(root.right);
        }
    }

    /**
     * 二叉树的中序遍历
     * 迭代法
     */
    public List<Integer> inorderTraversa1l(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                ans.add(root.val);
                root = root.right;
            }
        }
        return ans;
    }
}
