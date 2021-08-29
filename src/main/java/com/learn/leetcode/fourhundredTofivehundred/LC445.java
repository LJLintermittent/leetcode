package com.learn.leetcode.fourhundredTofivehundred;

import com.learn.leetcode.utils.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/8/29 12:44
 * Package: com.learn.leetcode.fourhundredTofivehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC445 {

    public static void main(String[] args) {
        ListNode root1 = new ListNode(7);
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        root1.next = node11;
        node11.next = node12;
        node12.next = node13;

        ListNode root2 = new ListNode(5);
        ListNode node21 = new ListNode(6);
        ListNode node22 = new ListNode(4);
        root2.next = node21;
        node21.next = node22;
        ListNode ans = addTwoNumbers(root1, root2);

        System.out.println(ans);

    }

    /**
     * 两数相加 II
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new LinkedList<>();
        Deque<Integer> stack2 = new LinkedList<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode head = null;
        //如果两个栈都为空了，但是还有进位，需要把进位加进去
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
            int sum = carry;
            sum += stack1.isEmpty() ? 0 : stack1.pop();
            sum += stack2.isEmpty() ? 0 : stack2.pop();
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
            carry = sum / 10;
        }
        return head;
    }
}
