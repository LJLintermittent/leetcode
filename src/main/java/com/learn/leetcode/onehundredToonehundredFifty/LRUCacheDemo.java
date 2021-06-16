package com.learn.leetcode.onehundredToonehundredFifty;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/6/16 21:40
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LRUCacheDemo<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCacheDemo(int capacity) {
        /**
         * accessOrder – the ordering mode -
         * true for access-order,  访问顺序
         * false for insertion-order 插入顺序
         */
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.size() > capacity;
    }

    /**
     * 借助linkedHashMap实现LRU缓存
     */
    public static void main(String[] args) {
        LRUCacheDemo<Object, Object> lruCache = new LRUCacheDemo<>(3);
        lruCache.put(1, "a");
        lruCache.put(2, "b");
        lruCache.put(3, "c");
        System.out.println(lruCache.keySet());
        lruCache.put(4, "d");
        System.out.println(lruCache.keySet());

    }
}
