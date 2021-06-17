package com.learn.leetcode.test;

/**
 * Description:
 * date: 2021/6/17 13:41
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class DoubleLinkedList<K, V> {
    Node<K, V> head;
    Node<K, V> tail;

    public DoubleLinkedList() {
        head = new Node<>();
        tail = new Node<>();
        head.next = tail;
        tail.prev = head;
    }

    public void addHead(Node<K, V> node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void removeNode(Node<K, V> node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.prev = null;
        node.next = null;
    }

    public Node<K, V> getLastNode() {
        return tail.prev;
    }
}
