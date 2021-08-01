package com.learn.leetcode.fiftyToOnehundred;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/8/1 22:25
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC61 {

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

        ListNode ans = rotateRight1(node1, 12);
        System.out.println(ans);
    }

    /**
     * 旋转链表
     */
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        if (k == 0) {
            return head;
        }
        ListNode tail = head;
        ListNode newtail = head;
        ListNode newhead;
        int n = 1;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }
        tail.next = head;
        for (int i = 0; i < (n - (k % n) - 1); i++) {
            newtail = newtail.next;
        }
        newhead = newtail.next;
        newtail.next = null;
        return newhead;
    }

    //review
    public static ListNode rotateRight1(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        if (k == 0) {
            return head;
        }
        ListNode tail = head;
        ListNode newtail = head;
        ListNode newhead;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        //将单链表连成一个环形链表
        tail.next = head;
        for (int i = 0; i < len - (k % len) - 1; i++) {
            newtail = newtail.next;
        }
        newhead = newtail.next;
        newtail.next = null;
        return newhead;
    }

}
