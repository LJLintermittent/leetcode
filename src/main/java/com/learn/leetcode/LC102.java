package com.learn.leetcode;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Description:
 * date: 2021/4/2 1:16
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LC102 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
//        TreeNode node5 = new TreeNode(19);
//        TreeNode node6 = new TreeNode(10);
        root.left = node1;
        root.right = node2;
//        node1.left = node5;
//        node1.right = node6;
        node2.left = node3;
        node2.right = node4;

        LC102 lc102 = new LC102();
        List<List<Integer>> lists = lc102.levelOrderTraversal(root);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }

    }

    /**
     * ************************二叉树的层序遍历
     *
     * @param root 根节点
     */
    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode topNode = queue.poll();
                list.add(topNode.val);
                if (topNode.left != null) {
                    queue.offer(topNode.left);
                }
                if (topNode.right != null) {
                    queue.offer(topNode.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}

