package com.learn.leetcode.onehundredToonehundredFifty;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/8/4 10:38
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC118 {

    public static void main(String[] args) {
        int nums = 5;
        List<List<Integer>> generate = generate(5);
        System.out.println(generate);

    }

    /**
     * 杨辉三角
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        //要往lists里面添加多少次的list
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(10);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
