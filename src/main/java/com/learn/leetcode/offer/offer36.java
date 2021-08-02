package com.learn.leetcode.offer;

import com.learn.leetcode.utils.ListNode;
import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * date: 2021/8/2 13:34
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer36 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        ListNode ans = treeToDoublyList(root);
        System.out.println(ans);

    }

    /**
     * 二叉搜索树与双向链表
     * 中序遍历
     */
    public static ListNode treeToDoublyList(TreeNode root) {
        List<ListNode> list = new ArrayList<>(10);
        Deque<TreeNode> stack = new LinkedList<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                ListNode listNode = new ListNode(root.val);
                list.add(listNode);
                root = root.right;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (ListNode listNode : list) {
            cur.next = listNode;
            cur = cur.next;
        }
        cur.next = dummy.next;
        return dummy.next;
    }
}
