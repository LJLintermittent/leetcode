package com.learn.leetcode.twohundredTothreehundred;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/7/27 19:13
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC234 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        boolean ans = isPalindrome(head);
        System.out.println(ans);
    }

    /**
     * 回文链表
     */
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode midNode = getmid(head);
        int length = getLength(head);
        ListNode right;
        if (length % 2 != 0) {
            right = midNode.next;
        } else {
            right = midNode;
        }
        ListNode reverseRight = reverse(right);
        while (reverseRight != null) {
            if (head.val != reverseRight.val) {
                return false;
            }
            head = head.next;
            reverseRight = reverseRight.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static ListNode getmid(ListNode head) {
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
        int length = 1;
        while (head.next != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}
