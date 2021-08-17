package com.learn.leetcode.onethousandTomore;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/8/17 11:38
 * Package: com.learn.leetcode.onethousandTomore
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC1171 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(-3);
        head.next.next.next.next = new ListNode(-2);
        ListNode ans = removeZeroSumSublists(head);

        System.out.println(ans);

    }

    /**
     * 从链表中删去总和值为零的连续节点
     */
    public static ListNode removeZeroSumSublists(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur != null) {
            ListNode p = cur.next;
            int sum = 0;
            while (p != null) {
                sum = sum + p.val;
                if (sum == 0) {
                    cur.next = p.next;
                    break;
                } else {
                    p = p.next;
                }
            }
            if (p == null) {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
