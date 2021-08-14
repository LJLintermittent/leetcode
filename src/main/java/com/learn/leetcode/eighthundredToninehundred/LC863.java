package com.learn.leetcode.eighthundredToninehundred;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * date: 2021/8/14 14:47
 * Package: com.learn.leetcode.eighthundredToninehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC863 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;

        LC863 lc863 = new LC863();
        List<Integer> list = lc863.distanceK(root, node1, 2);
        System.out.println(list);
    }

    // 用哈希表记录每个节点的父节点，key是当前节点的值，value是当前节点的父节点
    Map<Integer, TreeNode> parents = new HashMap<>();

    List<Integer> ans = new ArrayList<>();

    /*
     * 二叉树中所有距离为 K 的结点
     */
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // 从root出发，记录每个节点的父节点
        findParents(root);
        findAns(target, null, 0, k);
        return ans;
    }

    private void findAns(TreeNode target, TreeNode from, int depth, int k) {
        if (target == null) {
            return;
        }
        if (depth == k) {
            ans.add(target.val);
            return;
        }
        //避免重复搜索，传入一个来源节点，当目标节点与来源节点不同时才进行递归
        if (target.left != from) {
            findAns(target.left, target, depth + 1, k);
        }
        if (target.right != from) {
            findAns(target.right, target, depth + 1, k);
        }
        //顺着父节点往上搜索
        if (parents.get(target.val) != from) {
            findAns(parents.get(target.val), target, depth + 1, k);
        }
    }

    /**
     * 记录每个节点的父节点
     */
    private void findParents(TreeNode root) {
        if (root.left != null) {
            parents.put(root.left.val, root);
            findParents(root.left);
        }
        if (root.right != null) {
            parents.put(root.right.val, root);
            findParents(root.right);
        }
    }


}
