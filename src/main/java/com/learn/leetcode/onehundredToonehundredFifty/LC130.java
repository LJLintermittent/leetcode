package com.learn.leetcode.onehundredToonehundredFifty;

/**
 * Description:
 * date: 2021/9/1 11:37
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC130 {

    public static void main(String[] args) {

    }

    int row;

    int col;

    /**
     * 被围绕的区域
     */
    public void solve(char[][] board) {
        row = board.length;
        col = board[0].length;
        if (row == 0) {
            return;
        }
        for (int i = 0; i < row; i++) {
            dfs(board, i, 0);
            dfs(board, i, col - 1);
        }
        for (int i = 0; i < col; i++) {
            dfs(board, 0, i);
            dfs(board, row - 1, i);
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'L') {
                    board[i][j] = 'O';
                }
            }
        }

    }

    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'L';
        //使用深搜，如果能搜到，并且还是'O',那么说明和边界上的O直接相连，这个O就是不可被包围的，需要做一个标记
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}
