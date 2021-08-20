package com.learn.leetcode.onehundredToonehundredFifty;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/8/20 10:57
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC113 {

    public static void main(String[] args) {


    }

    List<List<Integer>> ans = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    /**
     * 路径总和 II
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, 0, targetSum);
        return ans;
    }

    private void dfs(TreeNode root, int num, int targetSum) {
        if (root == null) {
            return;
        }
        num += root.val;
        path.add(root.val);
        if (num == targetSum && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(path));
        }
        dfs(root.left, num, targetSum);
        dfs(root.right, num, targetSum);
        path.remove(path.size() - 1);

    }
}
