package com.learn.leetcode.oneToFifty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * date: 2021/7/19 12:07
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC39 {

    public static void main(String[] args) {
//        ArrayList<List<Integer>> lists = new ArrayList<>();
//        List<Integer> path = new ArrayList<>();
//        path.add(1);
//        path.add(2);
//        path.add(3);
//        lists.add(new ArrayList<>(path));
//        System.out.println(lists);
        int[] nums = {2, 3, 5};
        List<List<Integer>> lists = combinationSum(nums, 4);
        System.out.println(lists);

    }


    /**
     * 组合总和
     * 搜索回溯
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(res, new ArrayList<>(), candidates, target, 0, 0);
        return res;
    }

    private static void backtracking(List<List<Integer>> res, List<Integer> path, int[] candidates, int target
            , int sum, int idx) {
        //找到了和为target的组合
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        //for循环剪枝
        for (int i = idx; i < candidates.length; i++) {
            //如果sum + candidates[i]大于target就终止遍历
            if (sum + candidates[i] > target) {
                break;
            }
            path.add(candidates[i]);
            backtracking(res, path, candidates, target, sum + candidates[i], i);
            path.remove(path.size() - 1);
        }
    }
}

