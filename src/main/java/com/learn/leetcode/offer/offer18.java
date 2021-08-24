package com.learn.leetcode.offer;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/8/24 12:50
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer18 {

    public static void main(String[] args) {

    }

    /**
     * 删除链表的节点
     */
    public ListNode deleteNode(ListNode head, int val) {
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
