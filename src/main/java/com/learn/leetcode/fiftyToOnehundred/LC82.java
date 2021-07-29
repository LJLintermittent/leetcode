package com.learn.leetcode.fiftyToOnehundred;

import com.learn.leetcode.utils.ListNode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/7/29 13:55
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC82 {

    public static void main(String[] args) {
        ListNode head = new ListNode(-3);
        ListNode node1 = new ListNode(-1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(0);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode ans = deleteDuplicates(head);
        System.out.println(ans);


    }

    /**
     * 删除排序链表中的重复元素 II
     * 将链表中出现过多次的元素，即重复元素全部删除，不同于问题一，删到一个
     * 本题是重复元素全部删除
     */
    public static ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>(16);
        int count = 1;
        while (head != null) {
            if (map.containsKey(head.val)) {
                map.put(head.val, map.get(head.val) + 1);
                head = head.next;
            } else {
                map.put(head.val, count);
                head = head.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        Integer[] sort = map.keySet().toArray(new Integer[map.size()]);
        Arrays.sort(sort);
        for (int i = 0; i < map.size(); i++) {
            if (map.get(sort[i]) == 1) {
                ListNode node = new ListNode(sort[i]);
                cur.next = node;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
