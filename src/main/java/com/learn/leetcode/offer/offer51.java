package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/21 13:03
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer51 {

    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 4};
        offer51 offer51 = new offer51();
        int ans = offer51.reversePairs(nums);
        System.out.println(ans);
    }

    int[] nums, tmp;

    /**
     * 数组中的逆序对
     */
    public int reversePairs(int[] nums) {
        this.nums = nums;
        tmp = new int[nums.length];
        return mergeSort(0, nums.length - 1);
    }

    private int mergeSort(int l, int r) {
        // 终止条件
        if (l >= r) return 0;
        // 递归划分
        int m = (l + r) / 2;
        int res = mergeSort(l, m) + mergeSort(m + 1, r);
        // 合并阶段
        int i = l, j = m + 1;
        for (int k = l; k <= r; k++)
            tmp[k] = nums[k];
        for (int k = l; k <= r; k++) {
            if (i == m + 1)
                nums[k] = tmp[j++];
            else if (j == r + 1 || tmp[i] <= tmp[j])
                nums[k] = tmp[i++];
            else {
                nums[k] = tmp[j++];
                res += m - i + 1; // 统计逆序对
            }
        }
        return res;
    }
}
