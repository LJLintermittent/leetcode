package com.learn.leetcode.utils;

/**
 * Description:
 * date: 2021/8/8 12:41
 * Package: com.learn.leetcode.utils
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class RandomNode {

    public int val;
    public RandomNode next;
    public RandomNode random;

    public RandomNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

}
