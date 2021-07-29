package com.learn.leetcode.offer;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * date: 2021/7/29 17:27
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer54 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        int i = kthLargest(root, 3);
        System.out.println(i);
    }

    /**
     * 剑指 Offer 54. 二叉搜索树的第k大节点
     */
    public static int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>(10);
        Deque<TreeNode> stack = new LinkedList<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        Integer ans = list.get(list.size() - k);
        return ans;
    }
}
