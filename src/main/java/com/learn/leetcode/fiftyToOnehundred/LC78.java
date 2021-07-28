package com.learn.leetcode.fiftyToOnehundred;


import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/7/28 13:31
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC78 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);


    }

    /**
     * 子集
     * 动态规划的思想
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>(10);
        List<Integer> initlist = new ArrayList<>(10);
        lists.add(initlist);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int len = lists.size();
            for (int j = 0; j < len; j++) {
                List<Integer> list = lists.get(j);
                List<Integer> sub = new ArrayList<>(list);
                sub.add(num);
                lists.add(sub);
            }
        }
        return lists;
    }
}
