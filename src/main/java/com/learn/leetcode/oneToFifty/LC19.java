package com.learn.leetcode.oneToFifty;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/6/18 12:55
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LC19 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        System.out.println(head);
        ListNode res = removeNthFromEnd(head, 1);
        System.out.println(res);
    }

    /**
     * 删除链表的倒数第n个节点
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //哑节点的next指向头结点
        ListNode dummy = new ListNode(0, head);
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    /**
     * 计算链表长度
     */
    private static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }
}
