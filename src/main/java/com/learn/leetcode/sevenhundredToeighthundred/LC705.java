package com.learn.leetcode.sevenhundredToeighthundred;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/8/23 11:09
 * Package: com.learn.leetcode.sevenhundredToeighthundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC705 {

    public static void main(String[] args) {
        System.out.println(21 % 20);

    }

    // 质数取模，加大散列
    private static final int BASE = 769;

    private LinkedList[] data;

    /**
     * 设计哈希集合
     * HashSet
     */
    public LC705() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        int index = getIndex(key);
        Iterator<Integer> iterator = data[index].iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == key) {
                return;
            }
        }
        data[index].offerLast(key);
    }

    public void remove(int key) {
        int index = getIndex(key);
        Iterator<Integer> iterator = data[index].iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == key) {
                data[index].remove(element);
                return;
            }
        }
    }

    public boolean contains(int key) {
        int index = getIndex(key);
        Iterator<Integer> iterator = data[index].iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    private int getIndex(int key) {
        return key % BASE;
    }

}
