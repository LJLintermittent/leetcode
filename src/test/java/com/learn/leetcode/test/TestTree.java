package com.learn.leetcode.test;

import com.learn.leetcode.utils.TreeNode;
import org.assertj.core.util.Lists;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * date: 2021/7/1 0:45
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestTree {

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

//        List<Integer> ans = order(root);
        List<Integer> preOrderTreeAns = preOrderTree(root);
        System.out.println("前序遍历的结果：" + preOrderTreeAns);

        List<Integer> midOrderTreeAns = midOrderTree(root);
        System.out.println("中序遍历的结果：" + midOrderTreeAns);

        List<Integer> postOrderTreeAns = postOrderTree(root);
        System.out.println("后序遍历的结果：" + postOrderTreeAns);
    }

    static List<Integer> ans = Lists.newArrayList();

    /**
     * 递归
     */
    public static List<Integer> order(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return ans;
    }

    private static void helper(TreeNode root) {
        if (root.left != null) {
            helper(root.left);
        }
        ans.add(root.val);
        if (root.right != null) {
            helper(root.right);
        }

    }

    /**
     * 前序遍历
     * 迭代
     */
    public static List<Integer> preOrderTree(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                ans.add(root.val);
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                root = root.right;
            }
        }
        return ans;
    }

    /**
     * 后序遍历
     * 迭代
     */
    public static List<Integer> postOrderTree(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
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

    /**
     * 中序遍历
     * 迭代
     */
    public static List<Integer> midOrderTree(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                ans.add(root.val);
                root = root.right;
            }
        }
        return ans;
    }

}
