package com.learn.leetcode.test;

import com.learn.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * date: 2021/8/14 15:21
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class TestLC863 {

    public static void main(String[] args) {

    }

    Map<Integer, TreeNode> map = new HashMap<>();

    List<Integer> ans = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        findparents(root);
        dfs(target, null, 0, k);
        return ans;
    }

    public void dfs(TreeNode target, TreeNode from, int depth, int k) {
        if (target == null) {
            return;
        }
        if (depth == k) {
            ans.add(target.val);
            return;
        }
        if (target.left != from) {
            dfs(target.left, target, depth + 1, k);
        }
        if (target.right != from) {
            dfs(target.right, target, depth + 1, k);
        }
        if (map.get(target.val) != from) {
            dfs(map.get(target.val), target, depth + 1, k);
        }

    }

    public void findparents(TreeNode node) {
        if (node.left != null) {
            map.put(node.left.val, node);
            findparents(node.left);
        }
        if (node.right != null) {
            map.put(node.right.val, node);
            findparents(node.right);
        }
    }
}
