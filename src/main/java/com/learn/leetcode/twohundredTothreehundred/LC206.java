package com.learn.leetcode.twohundredTothreehundred;


import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/4/1 21:38
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LC206 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        ListNode listNode = reverseList1(node1);
        System.out.println(listNode);
    }

    /**
     * 迭代法反转链表
     *
     * @param head 头结点
     * @return 结点
     */
    public static ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    /**
     * 递归法 反转链表
     *
     * @param head 链表头结点
     * @return 结点
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pNext = head.next;
        head.next = null;
        ListNode reverseListNode = reverseList(pNext);
        pNext.next = head;
        return reverseListNode;

    }

    /**
     * 反转链表（二）
     */
    public static ListNode reverseList1(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode cur = pre.next;
        ListNode next;
        int n = getLength(head);
        for (int i = 0; i < n - 1; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummyNode.next;
    }

    public static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }


}


