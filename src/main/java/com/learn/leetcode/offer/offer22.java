package com.learn.leetcode.offer;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/7/15 19:45
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer22 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        int lenght = getLenght(head);
        System.out.println(lenght);
        ListNode ansNode = getKthFromEnd(head, 3);
        System.out.println(ansNode);
    }

    /**
     * 链表中倒数第K个节点
     */
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = getLenght(head);
        for (int i = 1; i <= (len - k); i++) {
            dummy.next = dummy.next.next;
        }
        return dummy.next;
    }

    public static int getLenght(ListNode head) {
        if (head == null) {
            return 0;
        }
        int length = 1;
        while (head.next != null) {
            length = length + 1;
            head = head.next;
        }
        return length;
    }

}
