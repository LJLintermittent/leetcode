package com.learn.leetcode.oneToFifty;

import java.util.*;

/**
 * Description:
 * date: 2021/8/14 15:43
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC47 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permuteUnique(nums);
        System.out.println(ans);

    }

    /**
     * 全排列Ⅱ
     */
    public static List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (len == 0) {
            return ans;
        }
        //排序是剪枝的前提
        Arrays.sort(nums);
        boolean[] used = new boolean[len];
        Deque<Integer> path = new LinkedList<>();
        dfs(nums, len, 0, used, path, ans);
        return ans;
    }

    private static void dfs(int[] nums, int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> ans) {
        if (depth == len) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, len, depth + 1, used, path, ans);
            used[i] = false;
            path.removeLast();
        }
    }
}
