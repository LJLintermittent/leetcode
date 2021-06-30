package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.left = node4;

        List<Integer> list = postorderTraversal(root);
        System.out.println(list);

    }

    static List<Integer> list = new ArrayList<>();

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

}

