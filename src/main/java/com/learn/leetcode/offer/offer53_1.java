package com.learn.leetcode.offer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * date: 2021/8/6 15:43
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer53_1 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 8, 10};
        List<Integer> ans = bs(nums, 0, nums.length - 1, 7);
        Integer[] ansArray = ans.toArray(new Integer[ans.size()]);
        Arrays.sort(ansArray);
        System.out.println(Arrays.toString(ansArray));

    }

    /**
     * 剑指 Offer 53 - I. 在排序数组中查找数字 I
     */
    public int search(int[] nums, int target) {
        List<Integer> list = bs(nums, 0, nums.length - 1, target);
        return list.size();
    }

    public static List<Integer> bs(int[] nums, int left, int right, int target) {
        if (left > right) {
            return new ArrayList<>();
        }
        int mid = left + (right - left) / 2;
        int midval = nums[mid];
        if (target > midval) {
            return bs(nums, mid + 1, right, target);
        } else if (target < midval) {
            return bs(nums, left, mid - 1, target);
        } else {
            int temp = mid - 1;
            List<Integer> ans = new ArrayList<>(10);
            while (true) {
                if (temp < 0 || nums[temp] != target) {
                    break;
                }
                ans.add(temp);
                temp--;
            }
            ans.add(mid);
            temp = mid + 1;
            while (true) {
                if (temp > right || nums[temp] != target) {
                    break;
                }
                ans.add(temp);
                temp++;
            }
            return ans;
        }
    }
}
