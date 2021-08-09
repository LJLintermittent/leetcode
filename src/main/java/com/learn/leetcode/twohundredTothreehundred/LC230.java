package com.learn.leetcode.twohundredTothreehundred;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/8/9 11:56
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC230 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;

        int ans = kthSmallest(root, 4);
        System.out.println(ans);
    }

    /**
     * 二叉搜索树中第K小的元素
     */
    public static int kthSmallest(TreeNode root, int k) {
        //传入根节点的左子节点，也就是要遍历左子树所有节点，来获得左子树的节点总数
        int leftN = findchild(root.left);
        if (leftN + 1 == k) {
            return root.val;
        } else if (k <= leftN) {
            return kthSmallest(root.left, k);
        } else {
            return kthSmallest(root.right, k - leftN - 1);
        }
    }

    private static int findchild(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return findchild(root.left) + findchild(root.right) + 1;
    }
}
