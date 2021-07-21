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


    }

    /**
     * 环形链表Ⅱ
     */
    public ListNode detectCycle(ListNode head) {
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
