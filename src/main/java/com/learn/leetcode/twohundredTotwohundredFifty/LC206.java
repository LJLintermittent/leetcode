package com.learn.leetcode.twohundredTotwohundredFifty;


import com.learn.leetcode.utils.ListNode;

import java.time.Period;

/**
 * Description:
 * date: 2021/4/1 21:38
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
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
        ListNode listNode = reverseList2(node1);
        System.out.println(listNode);
    }

    /**
     * **************************迭代法反转链表
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
     * *************************递归法 反转链表
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

}


