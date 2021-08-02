package com.learn.leetcode.twohundredTothreehundred;

/**
 * Description:
 * date: 2021/7/1 16:19
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC200 {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'}
                , {'1', '1', '0', '0', '0'}
                , {'0', '1', '0', '0', '0'}
                , {'0', '0', '1', '0', '0'}
        };
        int i = numIslands(grid);
        System.out.println(i);
    }

    /**
     * 岛屿数量
     * 深度优先搜索DFS
     */
    public static int numIslands(char[][] grid) {
        int row = grid.length;
        int line = grid[0].length;
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < line; j++) {
                if (grid[i][j] == '1') {
                    ans = ans + 1;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    private static void dfs(char[][] grid, int i, int j) {
        int row = grid.length;
        int line = grid.length;
        if (i < 0 || j < 0 || i >= row || j >= line || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
    }
}
