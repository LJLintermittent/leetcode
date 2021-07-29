package com.learn.leetcode.fiftyToOnehundred;

import com.learn.leetcode.utils.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/7/29 11:16
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC98 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        boolean ans = isValidBST2(root);
        System.out.println(ans);
    }

    /**
     * 验证二叉搜索树
     * 中序遍历 然后如果找到某个元素大于中序遍历的前一个元素，就终止
     * 可以优化遍历list方法，不需要遍历list了，在中序遍历的时候拿一个临时变量存储上一个节点的值
     * 那么下一个遍历到的节点值如果小于temp，直接返回false，不需要再遍历了
     */
    public static boolean isValidBST2(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        double temp = -Double.MAX_VALUE;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (root.val <= temp) {
                    return false;
                }
                temp = root.val;
                root = root.right;
            }
        }
        return true;
//        boolean flag = true;
//        for (int i = 1; i <= list.size() - 1; i++) {
//            if (list.get(i - 1) >= list.get(i)) {
//                flag = false;
//                return flag;
//            }
//        }
//        return flag;
    }

    /**
     * 中序遍历二叉搜索树，得到的一定是升序的队列
     * 二叉搜索树，当前节点的所有左子树节点均小于当前节点，
     * 所有右子树的节点均大于当前节点
     */
    public static boolean isValidBST1(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        double temp = -Double.MAX_VALUE;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= temp) {
                return false;
            }
            temp = root.val;
            root = root.right;
        }
        return true;
    }

    /**
     * 验证二叉搜索树
     */
    static long pre = Long.MIN_VALUE;

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        return isValidBST(root.right);
    }


}
