package com.learn.leetcode.test2;


import com.learn.leetcode.onehundredToonehundredFifty.LC146;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/9/2 12:03
 * Package: com.learn.leetcode.test2
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LRU {

    public static void main(String[] args) {
        LRU lru = new LRU(3);
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        System.out.println(lru.get(2));
        System.out.println(lru.map.keySet());
        lru.put(2, 22);
        System.out.println(lru.get(2));
        System.out.println(lru.map.keySet());
        lru.put(4, 4);
        System.out.println(lru.get(4));
        System.out.println(lru.map.keySet());
    }

    //LinkedHashMap

    Map<Integer, LRUNode<Integer, Integer>> map;
    DoubleLinkedList<Integer, Integer> doubleLinkedList;
    private int cachesize;

    public LRU(int cachesize) {
        map = new HashMap<>();
        doubleLinkedList = new DoubleLinkedList<>();
        this.cachesize = cachesize;
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
            if (map.size() == cachesize) {
                LRUNode last = doubleLinkedList.getLast();
                map.remove(last.key);
                doubleLinkedList.removeNode(last);
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
        }
    }

    class DoubleLinkedList<K, V> {

        LRUNode<K, V> tail;
        LRUNode<K, V> head;

        public DoubleLinkedList() {
            head = new LRUNode<>();
            tail = new LRUNode<>();
            head.next = tail;
            tail.prev = head;
        }

        public void addHead(LRUNode<K, V> node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        public void removeNode(LRUNode<K, V> node) {
            node.next.prev = node.prev;
            node.prev.next = node.next;
            node.prev = null;
            node.next = null;
        }

        public LRUNode getLast() {
            return tail.prev;
        }

    }
}
