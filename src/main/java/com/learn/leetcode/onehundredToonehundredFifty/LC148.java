package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/7/27 21:47
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC148 {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);

        head.next = node1;
        node1.next = node2;
        ListNode ans = sortList(head);
        System.out.println(ans);
    }

    /**
     * 排序链表
     */
    public static ListNode sortList(ListNode head) {
        ListNode temp = null;

        return head;
    }

}
