package com.learn.leetcode.threehundredTothreehundredfifty;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/8/7 14:33
 * Package: com.learn.leetcode.threehundredTothreehundredfifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC328 {

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(7);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode ans = oddEvenList(head);
        System.out.println(ans);
    }

    /**
     * 奇偶链表
     */
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        if (getlen(head) <= 2) {
            return head;
        }
        //奇链表的头
        ListNode oddHead = head;
        ListNode index1 = oddHead;
        //偶链表的头
        ListNode evenHead = head.next;
        ListNode index2 = evenHead;
        //真正开始轮询的链表头
        ListNode cur = evenHead.next;
        boolean flag = false;
        while (cur != null) {
            if (flag) {
                index2.next = cur;
                cur = cur.next;
                index2 = index2.next;
                flag = false;
            } else {
                index1.next = cur;
                cur = cur.next;
                index1 = index1.next;
                flag = true;
            }
        }
        index1.next = evenHead;
        index2.next = null;
        return oddHead;
    }

    public static int getlen(ListNode head) {
        if (head == null) {
            return 0;
        }
        int len = 1;
        while (head.next != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
