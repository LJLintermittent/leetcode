package com.learn.leetcode.oneToFifty;

import com.learn.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/6/29 14:48
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC23 {

    public static void main(String[] args) {
        ListNode[] nodes = new ListNode[2];
        ListNode List1Node1 = new ListNode(1);
        ListNode List1Node2 = new ListNode(2);
        ListNode List1Node3 = new ListNode(3);
        List1Node1.next = List1Node2;
        List1Node2.next = List1Node3;
        nodes[0] = List1Node1;
        ListNode list2Node1 = new ListNode(2);
        ListNode list2Node2 = new ListNode(5);
        ListNode list2Node3 = new ListNode(6);
        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;
        nodes[1] = list2Node1;

        ListNode ans = mergeKLists(nodes);
        System.out.println(ans);
    }

    /**
     * 合并k个升序链表
     * <p>
     * 优先队列
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0 || lists == null) {
            return null;
        }
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }
            priorityQueue.add(list);
        }
        while (!priorityQueue.isEmpty()) {
            ListNode nextNode = priorityQueue.poll();
            cur.next = nextNode;
            cur = cur.next;
            if (nextNode.next != null) {
                priorityQueue.add(nextNode.next);
            }
        }
        return dummyNode.next;
    }

}
