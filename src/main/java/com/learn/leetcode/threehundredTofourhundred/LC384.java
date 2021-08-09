package com.learn.leetcode.threehundredTofourhundred;

import java.util.Arrays;
import java.util.Random;

/**
 * Description:
 * date: 2021/8/9 13:22
 * Package: com.learn.leetcode.threehundredTofourhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC384 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        LC384 lc384 = new LC384(nums);
        System.out.println("初始时候的数组（未打乱）" + Arrays.toString(lc384.array));
        int[] shuffle1 = lc384.shuffle();
        System.out.println("第一次打乱:" + Arrays.toString(shuffle1));
        int[] reset = lc384.reset();
        System.out.println("还原后的数组：" + Arrays.toString(reset));
        int[] shuffle2 = lc384.shuffle();
        System.out.println("第二次打乱：" + Arrays.toString(shuffle2));
        int[] shuffle3 = lc384.shuffle();
        System.out.println("第三次打乱：" + Arrays.toString(shuffle3));
        int[] shuffle4 = lc384.shuffle();
        System.out.println("第四次打乱：" + Arrays.toString(shuffle4));
    }

    //初始化数组
    private int[] array;
    //初始化数组的拷贝，用于还原
    private int[] orig;

    Random random = new Random();

    private int randRange(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 打乱数组
     * 洗牌算法
     */
    public LC384(int[] nums) {
        array = nums;
        orig = nums.clone();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        array = orig;
        orig = orig.clone();
        return orig;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }

}
