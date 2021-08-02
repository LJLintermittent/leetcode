package com.learn.leetcode.oneToFifty;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/8/2 14:11
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC22 {

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        System.out.println(list);
    }

    /**
     * 括号生成
     */
    static List<String> res = new ArrayList<>(10);

    public static List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return res;
    }

    private static void dfs(int left, int right, String curStr) {
        //左右括号都不剩了，递归终止
        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }
        //左括号还剩余，可以拼接左括号
        if (left > 0) {
            dfs(left - 1, right, curStr + "(");
        }
        //如果右括号剩余多余左括号，可以拼接右括号
        if (right > left) {
            dfs(left, right - 1, curStr + ")");
        }
    }
}
