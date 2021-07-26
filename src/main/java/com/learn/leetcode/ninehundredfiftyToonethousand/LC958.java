package com.learn.leetcode.ninehundredfiftyToonethousand;

import com.learn.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 * date: 2021/7/26 19:45
 * Package: com.learn.leetcode.ninehundredfiftyToonethousand
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC958 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        boolean ans = isCompleteTree(root);
        System.out.println(ans);
    }

    /**
     * 二叉树的完全性检验
     */
    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        TreeNode cur;
        boolean flag = false;
        while (!queue.isEmpty()) {
            cur = queue.poll();
            if (cur == null) {
                flag = true;
                continue;
            }
            if (flag) {
                return false;
            }
            //使用cur来作为层序遍历的动态节点，不能使用root
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return true;
    }
}
