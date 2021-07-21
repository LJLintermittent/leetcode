package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * date: 2021/6/29 18:10
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC141 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
//        node4.next = null;
        node4.next = node2;
        boolean ans = hasCycle2(node1);
        System.out.println(ans);

    }

    /**
     * 环形链表 判断链表是否有环
     * 快慢指针
     */
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    /**
     * 哈希表
     * 如果if里面判断条件为true 即add返回false，代表有重复的，即链表有环
     */
    public static boolean hasCycle2(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
