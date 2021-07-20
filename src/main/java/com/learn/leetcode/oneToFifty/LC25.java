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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            //如果end == null，即需要翻转的链表部分节点数小于k，所以不执行翻转，保持原样
            if (end == null) {
                break;
            }
            //下一次要翻转的链表的头结点
            ListNode next = end.next;
            //此时end节点为要翻转的链表的尾结点
            end.next = null;
            //start为要翻转的链表的头结点
            ListNode start = pre.next;
            //指向翻转后的链表的头结点
            pre.next = reverse(start);
            //翻转后头结点变到了最后，通过这句话将前面断开的链表相连
            start.next = next;
            pre = start;
            end = start;
        }
        return dummy.next;
    }

    //链表反转
    private static ListNode reverse(ListNode head) {
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
