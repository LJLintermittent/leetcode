package com.learn.leetcode.offer;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/20 23:06
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer40 {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int[] ans = getLeastNumbers(arr, 2);
        System.out.println(Arrays.toString(ans));

    }

    /**
     * 最小的K个数
     */
    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] ans = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}
