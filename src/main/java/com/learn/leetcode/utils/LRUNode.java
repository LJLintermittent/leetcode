package com.learn.leetcode.utils;

/**
 * Description:
 * date: 2021/6/16 22:24
 * Package: com.learn.leetcode.utils
 *
 * @author 李佳乐
 * @version 1.0
 */
//构造一个Node节点，作为数据载体
public class LRUNode<K, V> {
    K key;
    V value;
    LRUNode<K, V> next;
    LRUNode<K, V> prev;

    public LRUNode() {
        this.prev = this.next = null;
    }

    public LRUNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.prev = this.next = null;
    }

}
