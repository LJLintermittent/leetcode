package com.learn.leetcode.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Description:
 * date: 2021/9/19 15:44
 * Package: com.learn.leetcode.sort
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class SelectSort {

    public static void main(String[] args) {
        int num = 200000;
        Random random = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            //生成0-n的随机数，包含0不包含n
            arr[i] = random.nextInt(num * 2);
        }
        TimeUtil.begin();
        sort(arr);
        Long consum = TimeUtil.concum();
        System.out.println("耗时：" + consum + "ms");//16381ms
//        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序
     * 在要排序的一组数中，选出最小的一个数与第一个位置的数进行交换
     * 然后在剩下的元素中再找出最小的与第二个位置的数进行交换，如此循环
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

    }
}
