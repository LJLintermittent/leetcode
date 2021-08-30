package com.learn.leetcode.oneToFifty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * date: 2021/8/30 8:07
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC40 {

    public static void main(String[] args) {

        int[] nums = {10,1,2,7,6,1,5};
        List<List<Integer>> ans = combinationSum2(nums, 8);
        System.out.println(ans);

    }

    private static List<List<Integer>> ans = new ArrayList<>();

    /**
     * 组合总和 II
     */
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        dfs(candidates, path, target, 0, 0);
        return ans;
    }

    private static void dfs(int[] candidates, List<Integer> path, int target, int sum, int begin) {
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }
            int Accumulation = candidates[i] + sum;
            if (Accumulation <= target) {
                path.add(candidates[i]);
                dfs(candidates, path, target, Accumulation, i + 1);
                path.remove(path.size() - 1);
            } else {
                break;
            }
        }

    }
}
