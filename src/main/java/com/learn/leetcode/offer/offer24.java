package com.learn.leetcode.offer;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/7/22 19:31
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer24 {

    public static void main(String[] args) {

    }

    /**
     * 反转链表
     */
    public ListNode reverseList(ListNode head) {
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
}
