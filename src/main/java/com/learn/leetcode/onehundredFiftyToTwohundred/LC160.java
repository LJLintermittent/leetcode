package com.learn.leetcode.onehundredFiftyToTwohundred;

import com.learn.leetcode.utils.ListNode;

import java.util.HashSet;


/**
 * Description:
 * date: 2021/7/18 0:44
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC160 {

    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        headA.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(headA);
        ListNode headB = new ListNode(5);
        ListNode headB1 = new ListNode(0);
        headB.next = headB1;
        headB1.next = node1;
        System.out.println(headB);

        ListNode ans = getIntersectionNode(headA, headB);
        System.out.println(ans);
    }

    /**
     * 相交链表
     * 哈希集合
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>(16);
        ListNode temp = headA;
        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (set.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;

    }

}
