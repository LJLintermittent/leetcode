package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.TreeNode;

import java.util.*;

/**
 * Description:
 * date: 2021/4/6 23:15
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LC103 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        LC103 lc103 = new LC103();
        List<List<Integer>> lists = lc103.zigzagLevelOrderDFS(root);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }

    public List<List<Integer>> zigzagLevelOrderDFS(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int sise = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < sise; i++) {
                TreeNode topNode = queue.poll();
                list.add(topNode.val);
                if (topNode.left != null) {
                    queue.offer(topNode.left);
                }
                if (topNode.right != null) {
                    queue.offer(topNode.right);
                }
            }
            if (flag) {
                lists.add(list);
            } else {
                Collections.reverse(list);
                lists.add(list);
            }
            flag = !flag;
        }
        return lists;
    }
}


/**
 * List<List<Integer>> lists = new ArrayList<>();
 * if (root == null) {
 * return lists;
 * }
 * Queue<TreeNode> queue = new LinkedList<>();
 * queue.offer(root);
 * boolean flag = true;
 * while (!queue.isEmpty()) {
 * int size = queue.size();
 * List<Integer> list = new ArrayList<>();
 * for (int i = 0; i < size; i++) {
 * TreeNode topNode = queue.poll();
 * list.add(topNode.val);
 * if (topNode.left != null) {
 * queue.offer(topNode.left);
 * }
 * if (topNode.right != null) {
 * queue.offer(topNode.right);
 * }
 * }
 * if (flag) {
 * lists.add(list);
 * } else {
 * Collections.reverse(list);
 * lists.add(list);
 * }
 * flag = !flag;
 * }
 * return lists;
 */
