package com.learn.leetcode.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Description:
 * date: 2021/9/20 14:17
 * Package: com.learn.leetcode.sort
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class HeapSort {

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
        sort(arr);
        Long consum = TimeUtil.concum();
        System.out.println("耗时：" + consum + "ms");//非常慢
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            max_heapify(arr, i);
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        }
    }

    private static void max_heapify(int[] arr, int n) {
        int child;
        for (int i = (n - 1) / 2; i >= 0; i--) {
            child = 2 * i + 1;
            if (child != n && arr[child] < arr[child + 1]) {
                child++;
            }
            if (arr[i] < arr[child]) {
                int temp = arr[child];
                arr[child] = arr[i];
                arr[i] = temp;
            }
        }

    }
}
