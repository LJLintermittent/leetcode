package com.learn.leetcode.test;

/**
 * Description:
 * date: 2021/6/17 13:37
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @version 1.0
 */
public class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;
    Node<K, V> prev;

    public Node() {
        this.next = this.prev = null;
    }

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = this.prev = null;
    }
}
