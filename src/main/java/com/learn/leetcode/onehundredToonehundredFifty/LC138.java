package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.RandomNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/8/8 12:43
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC138 {

    public static void main(String[] args) {

    }

    /**
     * 复制带随机指针的链表
     * 深拷贝
     */
    public RandomNode copyRandomList(RandomNode head) {
        if (head == null) {
            return head;
        }
        RandomNode node = head;
        Map<RandomNode, RandomNode> map = new HashMap<>(16);
        while (node != null) {
            RandomNode clone = new RandomNode(node.val);
            map.put(node, clone);
            node = node.next;
        }
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}
