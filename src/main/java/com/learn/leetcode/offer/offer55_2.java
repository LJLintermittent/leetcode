package com.learn.leetcode.offer;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/8/28 13:36
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer55_2 {

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
        int depth = getDepeth(root);

        System.out.println(depth);
    }

    /**
     * 剑指 Offer 55 - II. 平衡二叉树
     */
    public static boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        if (!isBalanced(root.left) || !isBalanced(root.right)) {
//            return false;
//        }
//        if (Math.abs(getDepeth(root.right) - getDepeth(root.left)) > 1) {
//            return false;
//        }
        if (root == null) {
            return true;
        }
        return Math.abs(getDepeth(root.left) - getDepeth(root.right)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int getDepeth(TreeNode root) {
        return root == null ? 0 : Math.max(getDepeth(root.right), getDepeth(root.left)) + 1;
    }

}
