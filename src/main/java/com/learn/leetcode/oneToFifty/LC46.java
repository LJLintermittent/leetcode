package com.learn.leetcode.oneToFifty;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Description:
 * date: 2021/6/17 20:41
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LC46 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> lists = permute(nums);
        System.out.println(lists);
    }

    /**
     * 全排列
     */
    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private static void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, len, depth + 1, path, used, res);
            path.removeLast();
            used[i] = false;
        }
    }
}
