package com.learn.leetcode.designpattern.iterator;

import java.util.List;

/**
 * Description:
 * date: 2021/9/15 10:37
 * Package: com.learn.leetcode.designpattern.iterator
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class IteratorImpl<E> implements Iterator<E> {

    private List<E> list;

    private int cursor;

    private E element;

    public IteratorImpl(List list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.println("当前位置" + cursor + ":");
        element = list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if (cursor > list.size() - 1) {
            return false;
        }
        return true;
    }
}
