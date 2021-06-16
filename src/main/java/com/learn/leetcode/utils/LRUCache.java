package com.learn.leetcode.utils;


import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/6/16 22:47
 * Package: com.learn.leetcode.utils
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LRUCache {

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.map.keySet());
        lruCache.put(2, 22);
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.map.keySet());
        lruCache.put(4, 4);
        System.out.println(lruCache.get(4));
        System.out.println(lruCache.map.keySet());
    }

    private int cacheSize;
    Map<Integer, LRUNode<Integer, Integer>> map;
    DoubleLinkedList<Integer, Integer> doubleLinkedList;

    public LRUCache(int cacheSize) {
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


}
