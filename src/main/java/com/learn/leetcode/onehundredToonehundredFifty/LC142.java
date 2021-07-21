package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * date: 2021/7/21 15:20
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC142 {

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
//        ListNode head = new ListNode(3);
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(4);
//        head.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node1;
        ListNode ans = detectCycle(node1);
        System.out.println(ans);
    }

    /**
     * 环形链表Ⅱ
     */
    public static ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> set = new HashSet<>(16);
        while (pos != null) {
            //add不成功，取反为正 进入代码块
            if (set.contains(pos)) {
                return pos;
            }else {
                set.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }
}
