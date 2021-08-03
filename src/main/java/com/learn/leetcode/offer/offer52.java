package com.learn.leetcode.offer;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/8/3 10:26
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer52 {

    public static void main(String[] args) {
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(3);

        a1.next = a2;
        a2.next = a3;

        ListNode b1 = new ListNode(8);
        ListNode b2 = new ListNode(7);

        b1.next = b2;


        ListNode ans = getIntersectionNode(a1, b1);
        System.out.println(ans);


    }

    /**
     * 剑指 Offer 52. 两个链表的第一个公共节点
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != node2) {
            node1 = node1 == null ? headB : node1.next;
            node2 = node2 == null ? headA : node2.next;
        }
        return node1;
    }

}
