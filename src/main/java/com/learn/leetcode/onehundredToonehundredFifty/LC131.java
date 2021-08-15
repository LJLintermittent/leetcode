package com.learn.leetcode.onehundredToonehundredFifty;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * date: 2021/8/15 10:24
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC131 {

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> lists = partition(s);
        System.out.println(lists);

    }

    /**
     * 分割回文串
     */
    public static List<List<String>> partition(String s) {
        int len = s.length();
        List<List<String>> ans = new ArrayList<>();
        if (len == 0) {
            return ans;
        }
        Deque<String> stack = new LinkedList<>();
        char[] chars = s.toCharArray();
        dfs(chars, 0, len, stack, ans);
        return ans;
    }

    private static void dfs(char[] chars, int index, int len, Deque<String> path, List<List<String>> ans) {
        if (index == len) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < len; i++) {
            if (!checkPalindrome(chars, index, i)) {
                continue;
            }
            path.addLast(new String(chars, index, i + 1 - index));
            dfs(chars, i + 1, len, path, ans);
            path.removeLast();
        }
    }

    /**
     * 判断是否是回文串
     */
    private static boolean checkPalindrome(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
