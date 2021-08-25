package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/25 10:39
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer53_2 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        int ans = missingNumber(nums);
        System.out.println(ans);

    }

    /**
     * 剑指 Offer 53 - II. 0～n-1中缺失的数字
     */
    public static int missingNumber(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            // 左子数组还没有发生数值与索引不匹配的情况
            if (nums[mid] == mid) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }
}
