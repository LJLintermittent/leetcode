package com.learn.leetcode.offer;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Description:
 * date: 2021/8/26 11:32
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer32_2 {

    public static void main(String[] args) {

    }

    /**
     * 从上到下打印二叉树 II
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
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
            ans.add(list);
        }
        return ans;
    }
}
