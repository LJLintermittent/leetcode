package com.learn.leetcode.offer;

import com.learn.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/8/23 10:56
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer25 {

    public static void main(String[] args) {

    }

    /**
     * 合并两个排序的链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode duummy = new ListNode(0);
        ListNode cur = duummy;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        queue.offer(l1);
        queue.offer(l2);
        while (!queue.isEmpty()) {
            ListNode minNode = queue.poll();
            cur.next = minNode;
            cur = cur.next;
            if (minNode.next != null) {
                queue.offer(minNode.next);
            }
        }
        return duummy.next;
    }

}
