package com.learn.leetcode.oneToFifty;

import com.learn.leetcode.utils.ListNode;


/**
 * Description:
 * date: 2021/8/4 11:03
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC24 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        ListNode listNode = swapPairs(head);
        System.out.println(listNode);


    }

    /**
     * 两两交换链表中的节点
     */
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode node1 = cur.next;
            ListNode node2 = cur.next.next;
            cur.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            cur = node1;
        }
        return dummy.next;
    }

    /**
     * 两两交换链表中的节点
     * 改变了节点的值
     */
    public static ListNode swapPairs1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        int temp;
        while (cur != null && cur.next != null) {
            temp = cur.val;
            cur.val = cur.next.val;
            cur.next.val = temp;
            cur = cur.next.next;
        }
        return head;
    }
}
