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
        lruCache.put(1, "a");
        lruCache.put(2, "b");
        lruCache.put(3, "c");
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.map.keySet());
        lruCache.put(2, "李佳乐");
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.map.keySet());
        lruCache.put(4, "阿里巴巴");
        System.out.println(lruCache.get(4));
        System.out.println(lruCache.map.keySet());
    }

    private int cacheSize;
    Map<Integer, LRUNode<Object, Object>> map;
    DoubleLinkedList<Object, Object> doubleLinkedList;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        map = new HashMap<>();
        doubleLinkedList = new DoubleLinkedList<>();
    }

    public Object get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        LRUNode<Object, Object> lruNode = map.get(key);
        doubleLinkedList.removeNode(lruNode);
        doubleLinkedList.addHead(lruNode);
        return lruNode.value;
    }

    public void put(int key, Object value) {
        if (map.containsKey(key)) {
            LRUNode<Object, Object> lruNode = map.get(key);
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
            LRUNode<Object, Object> newNode = new LRUNode<>(key, value);
            map.put(key, newNode);
            doubleLinkedList.addHead(newNode);
        }
    }


}
