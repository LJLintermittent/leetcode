package com.learn.leetcode.twohundredTothreehundred;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/8/24 12:32
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC203 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode head2 = new ListNode();
//        ListNode node21 = new ListNode(7);
//        ListNode node22 = new ListNode(7);
//        ListNode node23 = new ListNode(7);
//        head2.next = node21;
//        node21.next = node22;
//        node22.next = node23;
        LC203 lc203 = new LC203();
        ListNode ans = lc203.removeElements(null, 1);
        System.out.println(ans);

    }

    /**
     * 移除链表元素
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur != null) {
            if (cur.next != null && cur.next.val == val) {
                cur.next = cur.next.next;
                continue;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
