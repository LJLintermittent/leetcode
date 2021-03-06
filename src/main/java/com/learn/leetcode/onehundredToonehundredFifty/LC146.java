package com.learn.leetcode.onehundredToonehundredFifty;


import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/6/16 21:05
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @version 1.0
 */

@SuppressWarnings("all")
public class LC146 {

    public static void main(String[] args) {
        LC146 LC146 = new LC146(3);
        LC146.put(1, 1);
        LC146.put(2, 2);
        LC146.put(3, 3);
        System.out.println(LC146.get(2));
        System.out.println(LC146.map.keySet());
        LC146.put(2, 22);
        System.out.println(LC146.get(2));
        System.out.println(LC146.map.keySet());
        LC146.put(4, 4);
        System.out.println(LC146.get(4));
        System.out.println(LC146.map.keySet());
    }

    private int cacheSize;
    Map<Integer, LRUNode<Integer, Integer>> map;
    DoubleLinkedList<Integer, Integer> doubleLinkedList;

    public LC146(int cacheSize) {
        this.cacheSize = cacheSize;
        map = new HashMap<>();
        doubleLinkedList = new DoubleLinkedList<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        LRUNode<Integer, Integer> lruNode = map.get(key);
        doubleLinkedList.removeNode(lruNode);
        doubleLinkedList.addHead(lruNode);
        return lruNode.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            LRUNode<Integer, Integer> lruNode = map.get(key);
            lruNode.value = value;
            map.put(key, lruNode);
            doubleLinkedList.removeNode(lruNode);
            doubleLinkedList.addHead(lruNode);
        } else {
            if (map.size() == cacheSize) {
                LRUNode lastNode = doubleLinkedList.getLastNode();
                map.remove(lastNode.key);
                doubleLinkedList.removeNode(lastNode);
            }
            LRUNode<Integer, Integer> newNode = new LRUNode<>(key, value);
            map.put(key, newNode);
            doubleLinkedList.addHead(newNode);
        }
    }

    class LRUNode<K, V> {
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

    class DoubleLinkedList<K, V> {

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

}