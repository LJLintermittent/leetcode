package com.learn.leetcode.test;

import java.util.*;

/**
 * Description:
 * date: 2021/6/17 21:02
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class TestLC46 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> lists = permute(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        if (len == 0) {
            return lists;
        }
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, path, used, lists);
        return lists;
    }

    private static void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> lists) {
        if (depth == len) {
            lists.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, len, depth + 1, path, used, lists);
            path.removeLast();
            used[i] = false;
        }

    }


}
