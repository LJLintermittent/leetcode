package com.learn.leetcode.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Description:
 * date: 2021/9/20 13:48
 * Package: com.learn.leetcode.sort
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class QuickSort {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 4, 2, 5, 77, 2, 434, 31, 3, 0, -1};
        int num = 20;
        Random random = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            //生成0-n的随机数，包含0不包含n
            arr[i] = random.nextInt(num * 2);
        }
        TimeUtil.begin();
        sort(arr, 0, arr.length - 1);
        Long consum = TimeUtil.concum();
        System.out.println("耗时：" + consum + "ms");//36ms
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序
     * 找一个基准
     * 所有比基准小的放左边，比基准大的放右边，接着对左右两个子序列进行递归
     * 递归退出条件就是左边的索引已经大于等于右边的索引
     */
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int pivot = arr[i];
        while (i < j) {
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = pivot;
        sort(arr, left, i - 1);
        sort(arr, i + 1, right);

    }

}
