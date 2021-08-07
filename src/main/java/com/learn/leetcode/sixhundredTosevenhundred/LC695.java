package com.learn.leetcode.sixhundredTosevenhundred;

/**
 * Description:
 * date: 2021/8/7 13:08
 * Package: com.learn.leetcode.sixhundredTosevenhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC695 {

    public static void main(String[] args) {

    }

    /**
     * 岛屿的最大面积
     */
    public int MaxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ans = Math.max(ans, dfs(grid, i, j));
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[i].length || grid[i][j] == 0) {
            return 0;
        }
        // 自己本身是1以后，在深度优先搜索前，要把自己置为0，防止重复搜索
        grid[i][j] = 0;
        return dfs(grid, i - 1, j) + dfs(grid, i - 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1) + 1;
    }
}
