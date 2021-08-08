package com.learn.leetcode.sixhundredTosevenhundred;

import com.learn.leetcode.utils.TreeNode;

import java.util.HashMap;

/**
 * Description:
 * date: 2021/8/8 13:15
 * Package: com.learn.leetcode.sixhundredTosevenhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC662 {

    public static void main(String[] args) {

    }

    /**
     * 二叉树最大宽度
     */

    private int maxWidth = 0;

    HashMap<Integer, Integer> map = new HashMap<>(16);

    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 1, 1);
        return maxWidth;
    }

    private void dfs(TreeNode root, int level, int index) {
        if (root == null) {
            return;
        }
        //map里只存该层最先出现的index位置
        if (!map.containsKey(level)) {
            map.put(level, index);
        }
        maxWidth = Math.max(maxWidth, index - map.get(level) + 1);
        dfs(root.left, level + 1, index * 2);
        dfs(root.right, level + 1, index * 2 + 1);
    }

}
