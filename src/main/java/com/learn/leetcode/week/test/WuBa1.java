package com.learn.leetcode.week.test;

import java.util.*;

/**
 * Description:
 * date: 2021/9/25 19:20
 * Package: com.learn.leetcode.week.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class WuBa1 {

    public static void main(String[] args) {

        int[][] results = new int[][]{{1, 3, 2}, {4, 5, 6}, {9, 8, 7, 7}};
        int[][] results1 = new int[][]{{1, 3, 2}};
        int[][] results2 = new int[][]{{1},{},{}};
        int[] rec = rec(results2);
        System.out.println(Arrays.toString(rec));

    }

    public static int[] rec(int[][] results) {
        int total = results.length;
        if (results == null || total == 0) {
            return new int[0];
        }
        int every = results[0].length;
        int[] ans = new int[total * every];
        int index = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < every; j++) {
                ans[index++] = results[i][j];
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ans.length; i++) {
            set.add(ans[i]);
        }
        int[] finalAns = new int[set.size()];
        List<Integer> list = new ArrayList<>();
        for (Integer integer : set) {
            list.add(integer);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int count = 0;
        for (Integer integer : list) {
            finalAns[count++] = integer;
        }
        return finalAns;
    }
}
