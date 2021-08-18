package com.learn.leetcode.fivehundredToSixhundred;

import com.learn.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 * date: 2021/8/18 11:10
 * Package: com.learn.leetcode.fivehundredToSixhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC513 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        int ans = findBottomLeftValue(root);
        System.out.println(ans);

    }

    /**
     * 找树左下角的值
     * 先右后左广度优先搜索，最后队列里剩下的一定是最后一层最左边的节点
     * BFS
     */
    public static int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null) {
                queue.offer(root.right);
            }
            if (root.left != null) {
                queue.offer(root.left);
            }
        }
        return root.val;
    }

}
