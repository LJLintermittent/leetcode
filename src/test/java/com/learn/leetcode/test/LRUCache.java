package com.learn.leetcode.test;


import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/6/17 13:51
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LRUCache {

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1, 1);
        lruCache.put(2, 22);
        lruCache.put(3, 3);
        System.out.println(lruCache.map.keySet());
        System.out.println(lruCache.get(2));
        lruCache.put(4, 4);
        System.out.println(lruCache.map.keySet());

    }

    private int capacity;
    Map<Integer, Node<Integer, Integer>> map;
    DoubleLinkedList<Integer, Integer> doubleLinkedList;

    public LRUCache(int capacity) {
        map = new HashMap<>(10);
        doubleLinkedList = new DoubleLinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node<Integer, Integer> node = map.get(key);
        doubleLinkedList.removeNode(node);
        doubleLinkedList.addHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node<Integer, Integer> node = map.get(key);
            node.value = value;
            map.put(key, node);
            doubleLinkedList.removeNode(node);
            doubleLinkedList.addHead(node);
        } else {
            if (map.size() == capacity) {
                Node<Integer, Integer> lastNode = doubleLinkedList.getLastNode();
                map.remove(lastNode.key);
                doubleLinkedList.removeNode(lastNode);
            }
            Node<Integer, Integer> newNode = new Node<>(key, value);
            map.put(key, newNode);
            doubleLinkedList.addHead(newNode);
        }
    }
}
