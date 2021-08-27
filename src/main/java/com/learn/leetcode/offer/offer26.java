package com.learn.leetcode.offer;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/8/27 13:14
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer26 {

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

        TreeNode root2 = new TreeNode(4);
        TreeNode node21 = new TreeNode(1);
        root2.left = node21;
        boolean ans = isSubStructure(root, root2);

        System.out.println(ans);

    }

    /**
     * 树的子结构
     */
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (core(A, B)
                || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    private static boolean core(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return core(A.left, B.left) && core(A.right, B.right);
    }
}
