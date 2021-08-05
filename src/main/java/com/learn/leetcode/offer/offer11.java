package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/5 16:03
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer11 {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};

        int ans = minArray(nums);
        System.out.println(ans);

    }

    /**
     * 剑指 Offer 11. 旋转数组的最小数字
     */
    public static int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            //这种写法避免了low+high过大溢出
            int mid = low + (high - low) / 2;
            if (numbers[mid] < numbers[high]) {
                high = mid;
            } else if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            } else {
                high = high - 1;
            }
        }
        return numbers[low];
    }
}
