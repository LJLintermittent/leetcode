package com.learn.leetcode.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Description:
 * date: 2021/9/19 16:00
 * Package: com.learn.leetcode.sort
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class MergeSort {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 4, 2, 5, 77, 2, 434, 31, 3, 0, -1};
        int num = 30;
        Random random = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            //生成0-n的随机数，包含0不包含n
            arr[i] = random.nextInt(num * 2);
        }
        TimeUtil.begin();
        sort(arr, 0, arr.length - 1);
        Long consum = TimeUtil.concum();
        System.out.println("耗时：" + consum + "ms");//42ms
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 归并排序
     */
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int m = 0; m < temp.length; m++) {
            arr[m + left] = temp[m];
        }
    }

}
