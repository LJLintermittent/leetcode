package com.learn.leetcode.twohundredTothreehundred;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/7/31 20:03
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC222 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        int i = countNodes(root);

        System.out.println(i);
    }

    /**
     * 完全二叉树的节点个数
     * 完全二叉树的定义：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，
     * 并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含1到2的h次方个节点。
     */
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftdepth = getDepth(root.left);
        int rightdepth = getDepth(root.right);
        //如果左右子树高度相等，那么左子树一定是满二叉树
        if (leftdepth == rightdepth) {
            return (int) (Math.pow(2, leftdepth) + countNodes(root.right));
            //右子树是满二叉树
        } else {
            return (int) (Math.pow(2,rightdepth) + countNodes(root.left));
        }
    }

    //获取完全二叉树的深度
    public static int getDepth(TreeNode root) {
        int ans = 0;
        while (root != null) {
            ans++;
            root = root.left;
        }
        return ans;
    }

    List<Integer> list = new ArrayList<>(10);

    public int countNodes1(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return list.size();
    }

    //中序遍历计算节点个数
    public void helper(TreeNode root) {
        if (root.left != null) {
            helper(root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            helper(root.right);
        }
    }
}
