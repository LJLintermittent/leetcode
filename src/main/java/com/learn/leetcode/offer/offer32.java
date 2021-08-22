package com.learn.leetcode.offer;

import com.learn.leetcode.utils.TreeNode;

import java.util.*;

/**
 * Description:
 * date: 2021/8/22 15:44
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer32 {

    public static void main(String[] args) {

    }

    /**
     * 从上到下打印二叉树 III
     * 第一行从左到右，第二行从右到左
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
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
