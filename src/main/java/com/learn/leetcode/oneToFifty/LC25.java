package com.learn.leetcode.oneToFifty;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/7/19 23:12
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC25 {

    public static void main(String[] args) {

    }

    /**
     * K个一组翻转链表
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        return null;
    }

    //链表反转
    public ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    private static int getLength(ListNode head) {
        int length = 1;
        while (head.next != null) {
            length = length + 1;
            head = head.next;
        }
        return length;
    }

}
