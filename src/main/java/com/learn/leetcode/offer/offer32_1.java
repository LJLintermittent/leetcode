package com.learn.leetcode.offer;

import com.learn.leetcode.utils.TreeNode;

import java.util.*;

/**
 * Description:
 * date: 2021/8/31 11:29
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer32_1 {

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
        int[] ans = levelOrder(root);

        System.out.println(Arrays.toString(ans));

    }

    /**
     * 从上到下打印二叉树
     * 层序遍历
     */
    public static int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> lists = new ArrayList<>();
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
        int totalsize = 0;
        for (List<Integer> list : lists) {
            totalsize = totalsize + list.size();
        }
        int idnex = 0;
        int[] ans = new int[totalsize];
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                ans[idnex++] = integer;
            }
        }
        return ans;
    }
}
