package com.learn.leetcode.sevenhundredToeighthundred;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/8/23 11:50
 * Package: com.learn.leetcode.sevenhundredToeighthundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC706 {

    class Node {

        private int key;

        private int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    private static final int BASE = 769;

    private LinkedList[] data;

    /**
     * 设计哈希映射
     */
    public LC706() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i] = new LinkedList<Node>();
        }
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        Iterator<Node> iterator = data[index].iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.getKey() == key) {
                node.setValue(value);
                return;
            }
        }
        data[index].offerLast(new Node(key, value));
    }

    public int get(int key) {
        int index = getIndex(key);
        Iterator<Node> iterator = data[index].iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.getKey() == key) {
                return node.getValue();
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = getIndex(key);
        Iterator<Node> iterator = data[index].iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.getKey() == key) {
                data[index].remove(node);
                return;
            }
        }
    }

    public int getIndex(int key) {
        return key % BASE;
    }
}

