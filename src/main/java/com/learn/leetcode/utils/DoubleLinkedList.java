package com.learn.leetcode.utils;


/**
 * Description:
 * date: 2021/6/16 22:29
 * Package: com.learn.leetcode.utils
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
//构造一个双向链表，放置Node
public class DoubleLinkedList<K, V> {

    LRUNode<K, V> head;
    LRUNode<K, V> tail;

    public DoubleLinkedList() {
        head = new LRUNode<>();
        tail = new LRUNode<>();
        head.next = tail;
        tail.prev = head;
    }

    //添加节点到队列头部
    public void addHead(LRUNode<K, V> node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    //删除节点
    public void removeNode(LRUNode<K, V> node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = null;
        node.prev = null;
    }

    //获取队列最后一个节点，也就是最近最少使用的节点，为了删除做准备
    public LRUNode getLastNode() {
        return tail.prev;
    }

}
