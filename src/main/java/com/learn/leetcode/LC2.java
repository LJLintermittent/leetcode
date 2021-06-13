package com.learn.leetcode;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/4/3 16:24
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LC2 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);  //342
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);  //465

        node4.next = node5;
        node5.next = node6;

//        System.out.println(20 % 10);
//        System.out.println(9 / 10);

        ListNode node = addTwoNumbers(node1, node5);
        System.out.println(node);

    }

    /**
     * ************************两数相加
     *
     * @param l1 链表1的头结点
     * @param l2 链表2的头结点
     * @return 相加后的结点
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n = (l1 != null) ? l1.val : 0;
            int m = (l2 != null) ? l2.val : 0;
            int sum = m + n + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}


/**
 * ListNode head = null;
 * ListNode tail = null;
 * int carry = 0;
 * while (l1 != null || l2 != null) {
 * int m = (l1 != null) ? l1.val : 0;
 * int n = (l2 != null) ? l2.val : 0;
 * int sum = m + n + carry;
 * if (head == null) {
 * head = tail = new ListNode(sum % 10);
 * } else {
 * tail.next = new ListNode(sum % 10);
 * tail = tail.next;
 * }
 * carry = sum / 10;
 * if (l1 != null) {
 * l1 = l1.next;
 * }
 * if (l2 != null) {
 * l2 = l2.next;
 * }
 * }
 * if (carry > 0) {
 * tail.next = new ListNode(carry);
 * }
 * return head;
 */
