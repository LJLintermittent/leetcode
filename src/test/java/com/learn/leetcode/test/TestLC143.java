package com.learn.leetcode.test;

import com.learn.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Description:
 * date: 2021/7/27 14:04
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class TestLC143 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        reorderList(head);
        System.out.println(head);
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode midNode = midNode(head);
        ListNode newHead = midNode.next;
        midNode.next = null;
        newHead = reverse(newHead);

        ListNode headtemp = head.next;
        ListNode newheadtemp = newHead;
        List<ListNode> list = new ArrayList<>();
        list.add(head);
        boolean flag = true;
        while (headtemp != null || newheadtemp!= null) {
            if (flag) {
                list.add(newheadtemp);
                newheadtemp = newheadtemp.next;
                flag = false;
            } else {
                list.add(headtemp);
                headtemp = headtemp.next;
                flag = true;
            }
        }
        helper(head, list);
    }

    static int count = 1;

    public static void helper(ListNode head, List<ListNode> list) {
        while (count < list.size()) {
            head.next = list.get(count);
            count++;
            helper(head.next, list);
        }
    }

    public static ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}