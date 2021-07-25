package com.learn.leetcode.onehundredFiftyToTwohundred;

import com.learn.leetcode.utils.TreeNode;

import java.util.*;

/**
 * Description:
 * date: 2021/7/25 20:27
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC199 {

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

        List<Integer> list = rightSideView(root);
        System.out.println(list);

    }

    /**
     * 二叉树的右视图
     * 二叉树的层序遍历 然后只取每行，也就是每个list的最后一个值
     */
    public static List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
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
            ans.add(list.get(list.size() - 1));
        }
        return ans;

    }
}
