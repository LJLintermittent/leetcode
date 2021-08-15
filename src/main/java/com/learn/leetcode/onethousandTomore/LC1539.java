package com.learn.leetcode.onethousandTomore;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/8/15 9:53
 * Package: com.learn.leetcode.onethousandTomore
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC1539 {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 7, 11};
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9};
        int i = findKthPositive(arr, 5);
        System.out.println(i);

    }

    /**
     * 第 k 个缺失的正整数
     */
    public static int findKthPositive(int[] arr, int k) {
        int[] temp = new int[1000];
        for (int i = 0; i < 1000; i++) {
            temp[i] = i + 1;
        }
        int index = 0;
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != temp[index]) {
                list.add(temp[index++]);
            }
            index++;
        }
        Integer[] ans = list.toArray(new Integer[0]);
        if (ans.length == 0) {
            return arr.length + k;
        }
        if (k > ans.length) {
            return arr[arr.length - 1] + (k - ans.length);
        }
        return ans[k - 1];
    }
}
