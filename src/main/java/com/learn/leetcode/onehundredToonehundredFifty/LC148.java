package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/7/27 21:47
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC148 {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;


        ListNode ans = sortList(head);
        System.out.println(ans);
    }

    /**
     * 排序链表
     */
    public static ListNode sortList(ListNode head) {
        //递归结束条件
        if (head == null || head.next == null) {
            return head;
        }
        ListNode midNode = getMidNode(head);
        ListNode rightHead = midNode.next;
        midNode.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);
        return merge(left,right);
    }

    public static ListNode getMidNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        queue.offer(l1);
        queue.offer(l2);
        while (!queue.isEmpty()) {
            ListNode minNode = queue.poll();
            cur.next = minNode;
            cur = cur.next;
            if (minNode.next != null) {
                queue.offer(minNode.next);
            }
        }
        return dummy.next;
    }

}
