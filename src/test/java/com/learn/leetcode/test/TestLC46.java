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
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> lists = permute(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        if (len == 0) {
            return lists;
        }
        boolean[] used = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, len, 0, used, path, lists);
        return lists;
    }

    private static void dfs(int[] nums, int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> lists) {
        if (depth == len) {
            lists.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            path.addLast(nums[i]);
            dfs(nums, len, depth + 1, used, path, lists);
            used[i] = false;
            path.removeLast();
        }
    }


}
