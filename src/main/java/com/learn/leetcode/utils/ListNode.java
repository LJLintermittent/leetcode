package com.learn.leetcode.utils;

/**
 * Description:
 * date: 2021/4/2 0:37
 * Package: com.learn.leetcode.utils
 *
 * @author 李佳乐
 * @version 1.0
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
