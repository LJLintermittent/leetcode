package com.learn.leetcode.sort;

import java.util.Random;

/**
 * Description:
 * date: 2021/9/19 15:13
 * Package: com.learn.leetcode.sort
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class InsertSort {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 4, 2, 5, 77, 2, 434, 31, 3, 0, -1};
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
        System.out.println("耗时：" + consum + "ms");//22439
//        System.out.println(Arrays.toString(arr));
    }

    /**
     * 插入排序
     * 基本思想是外层循环从第一个开始向后遍历
     * 内存循环永远比外层循环起始点大1，然后开始递减，比较的是外层循环两两间的大小，进行交换
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
