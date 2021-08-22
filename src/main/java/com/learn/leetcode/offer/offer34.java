package com.learn.leetcode.offer;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/8/22 16:05
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer34 {

    public static void main(String[] args) {

    }

    List<List<Integer>> ans = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    /**
     * 二叉树中和为某一值的路径
     */
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, 0, target);
        return ans;

    }

    private void dfs(TreeNode root, int sum, int target) {
        if (root == null) {
            return;
        }
        sum += root.val;
        path.add(root.val);
        if (sum == target && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(path));
        }
        dfs(root.left, sum, target);
        dfs(root.right, sum, target);
        path.remove(path.size() - 1);
    }
}
