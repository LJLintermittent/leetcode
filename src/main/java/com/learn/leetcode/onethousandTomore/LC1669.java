package com.learn.leetcode.onethousandTomore;

import com.learn.leetcode.utils.ListNode;

/**
 * Description:
 * date: 2021/9/1 11:01
 * Package: com.learn.leetcode.onethousandTomore
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC1669 {

    public static void main(String[] args) {
        ListNode root = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode root2 = new ListNode(11111);
        ListNode node21 = new ListNode(22222);
        root2.next = node21;
        ListNode ans = mergeInBetween(root, 3, 4, root2);
        System.out.println(ans);
    }

    /**
     * 合并两个链表
     */
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int len1 = getLenght(list1);
        int deleteLen = b - a + 1;
        ListNode dummy = new ListNode(0);
        dummy.next = list1;
        ListNode cur = dummy;
        for (int i = 0; i < len1; i++) {
            if (i == a) {
                int count = 0;
                //删除节点
                while (count < deleteLen) {
                    cur.next = cur.next.next;
                    count++;
                }
                //拿到删除以后的后半段链表
                ListNode oldList = cur.next;
                //拼装
                cur.next = list2;
                //将拼装后的链表遍历到尾结点，然后拼装原链表
                while (list2.next != null) {
                    list2 = list2.next;
                }
                list2.next = oldList;
                break;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    public static int getLenght(ListNode root) {
        int length = 1;
        if (root == null) {
            return 0;
        }
        while (root.next != null) {
            root = root.next;
            length++;
        }
        return length;
    }
}
