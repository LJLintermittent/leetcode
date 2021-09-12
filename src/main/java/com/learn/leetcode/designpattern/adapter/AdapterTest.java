package com.learn.leetcode.designpattern.adapter;

/**
 * Description:
 * date: 2021/9/12 20:14
 * Package: com.learn.leetcode.designpattern.adapter
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class AdapterTest {

    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.output5V();
    }
}
