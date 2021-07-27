package com.learn.leetcode.eighthundredToninehundred;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/7/27 12:25
 * Package: com.learn.leetcode.eighthundredToeighthundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC876 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
//        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
//        node3.next = node4;
        ListNode ans = middleNode(head);
        System.out.println(ans);
    }

    /**
     * 链表的中间节点
     */
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (getLength(head) % 2 == 0) {
            return slow.next;
        } else {
            return slow;
        }
    }

    public static int getLength(ListNode head) {
        int len = 1;
        if (head == null) {
            return 0;
        }
        while (head.next != null) {
            head = head.next;
            len++;
        }
        return len;
    }

}
