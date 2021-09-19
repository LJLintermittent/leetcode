package com.learn.leetcode.sort;

import java.util.Random;

/**
 * Description:
 * date: 2021/9/19 15:22
 * Package: com.learn.leetcode.sort
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class BubbleSort {

    public static void main(String[] args) {
        int num = 200000;
        Random random = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            //生成0-n的随机数，包含0不包含n
            arr[i] = random.nextInt(1000001);
        }
        TimeUtil.begin();
        sort(arr);
        Long consum = TimeUtil.concum();
        System.out.println("耗时：" + consum + "ms");//58959
    }

    /**
     * 冒泡排序
     * 两两比较元素，大的放后面，往下遍历
     * 一轮走完最后一个元素就是最大的元素
     * 但是前面的元素还不是有序的，重复上面的比较操作，总共比较n-1轮，n是元素总数
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
