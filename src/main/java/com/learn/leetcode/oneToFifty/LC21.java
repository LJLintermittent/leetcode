package com.learn.leetcode.oneToFifty;

import com.learn.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/6/29 16:00
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC21 {

    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(1);
        ListNode list1Node2 = new ListNode(2);
        ListNode list1Node3 = new ListNode(3);
        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;

        ListNode list2Node1 = new ListNode(3);
        ListNode list2Node2 = new ListNode(5);
        ListNode list2Node3 = new ListNode(7);
        ListNode node4 = new ListNode(8);

        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;
        list2Node3.next = node4;

        ListNode ans = mergeTwoLists2(list1Node1, list2Node1);
        System.out.println(ans);

    }

    /**
     * 合并两个有序链表
     * 优先队列
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null && l2 != null) {
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        }
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        priorityQueue.offer(l1);
        priorityQueue.offer(l2);
        while (!priorityQueue.isEmpty()) {
            ListNode minNode = priorityQueue.poll();
            cur.next = minNode;
            cur = cur.next;
            if (minNode.next != null) {
                priorityQueue.offer(minNode.next);
            }
        }
        return dummyNode.next;
    }

    /**
     * 普通方法
     */
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            cur.next = l2;
        } else if (l2 == null) {
            cur.next = l1;
        }
        return dummy.next;
    }
}

/**
 * ListNode dummyNode = new ListNode(0);
 * ListNode cur = dummyNode;
 * while (l1 != null && l2 != null) {
 * if (l1.val < l2.val) {
 * cur.next = l1;
 * cur = cur.next;
 * l1 = l1.next;
 * } else {
 * cur.next = l2;
 * cur = cur.next;
 * l2 = l2.next;
 * }
 * }
 * if (l1 == null) {
 * cur.next = l2;
 * } else if (l2 == null) {
 * cur.next = l1;
 * }
 * return dummyNode.next;
 */
