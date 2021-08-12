package com.learn.leetcode.sixhundredTosevenhundred;

import com.learn.leetcode.utils.TreeNode;

/**
 * Description:
 * date: 2021/8/12 11:01
 * Package: com.learn.leetcode.sixhundredTosevenhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC617 {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root1N1 = new TreeNode(2);
        TreeNode root1N2 = new TreeNode(3);
        root1.left = root1N1;
        root1.right = root1N2;

        TreeNode root2 = new TreeNode(2);
        TreeNode root2N1 = new TreeNode(5);
        TreeNode root2N2 = new TreeNode(3);
        root2.left = root2N1;
        root2.right = root2N2;

        TreeNode ans = mergeTrees(root1, root2);
        System.out.println(ans);

    }

    /**
     * 合并二叉树
     */
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode ansNode = new TreeNode(root1.val + root2.val);
        ansNode.left = mergeTrees(root1.left, root2.left);
        ansNode.right = mergeTrees(root1.right, root2.right);
        return ansNode;
    }
}
