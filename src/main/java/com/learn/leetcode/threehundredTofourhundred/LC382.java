package com.learn.leetcode.threehundredTofourhundred;

import com.learn.leetcode.utils.ListNode;

import java.util.Random;

/**
 * Description:
 * date: 2021/8/13 11:23
 * Package: com.learn.leetcode.threehundredTofourhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC382 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        LC382 lc382 = new LC382(head);
        int random = lc382.getRandom();
        System.out.println(random);

    }

    ListNode head;
    Random random;

    /**
     * 链表随机节点
     * 蓄水池抽样算法
     */
    public LC382(ListNode head) {
        this.head = head;
        this.random = new Random();
    }

    public int getRandom() {
        int res = head.val;
        ListNode cur = head.next;
        int i = 2;
        while (cur != null) {
            if (random.nextInt(i) == 0) {//0到i 取1/i的概率，保留当前数字
                res = cur.val;
            }
            i++;
            cur = cur.next;
        }
        return res;
    }
}
