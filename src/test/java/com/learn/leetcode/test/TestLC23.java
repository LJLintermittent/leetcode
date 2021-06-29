package com.learn.leetcode.test;

import com.learn.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/6/29 15:43
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestLC23 {

    public static void main(String[] args) {
        ListNode[] nodes = new ListNode[2];
        ListNode List1Node1 = new ListNode(1);
        ListNode List1Node2 = new ListNode(3);
        ListNode List1Node3 = new ListNode(4);
        List1Node1.next = List1Node2;
        List1Node2.next = List1Node3;
        nodes[0] = List1Node1;
        ListNode list2Node1 = new ListNode(2);
        ListNode list2Node2 = new ListNode(22);
        ListNode list2Node3 = new ListNode(33);
        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;
        nodes[1] = list2Node1;

        ListNode ans = mergeKLists(nodes);
        System.out.println(ans);

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;
        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }
            priorityQueue.add(list);
        }
        while (!priorityQueue.isEmpty()) {
            ListNode minNode = priorityQueue.poll();
            cur.next = minNode;
            cur = cur.next;
            if (minNode.next != null) {
                priorityQueue.add(minNode.next);
            }
        }
        return dummyNode.next;
    }

}
