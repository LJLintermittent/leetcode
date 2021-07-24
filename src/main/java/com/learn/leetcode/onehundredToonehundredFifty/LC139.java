package com.learn.leetcode.onehundredToonehundredFifty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Description:
 * date: 2021/7/24 10:34
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC139 {

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> list = new ArrayList<>(10);
        list.add("leet");
        list.add("code");
        LC139 lc139 = new LC139();
        boolean b = lc139.wordBreak(s, list);
        System.out.println(b);
//        System.out.println(lc139.ans);
    }

    /**
     * 单词拆分
     * 动态规划
     * 完全背包问题
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        // dp[i]：长度为i的s的子串s[0,i-1]能否分解为单词表中出现的单词，题目求dp[s.length()]
        dp[0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                //状态转移方程，用指针j去划分s[0,i]子串
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }


    /**
     * 使用下一题的回溯解法 超时
     * 但思路没问题
     */
    public boolean wordBreak1(String s, List<String> wordDict) {
        backtrack(0, s, wordDict, new ArrayList<>());
        if (ans.isEmpty()) {
            return false;
        }
        return true;
    }

    List<String> ans = new ArrayList<>(10);

    private void backtrack(int len, String s, List<String> wordDict, List<String> path) {
        if (len >= s.length()) {
            ans.add(String.join(" ", path));
            return;
        }
        for (String word : wordDict) {
            if (len + word.length() <= s.length() && s.substring(len, len + word.length()).equals(word)) {
                path.add(word);
                backtrack(len + word.length(), s, wordDict, path);
                if (!ans.isEmpty()) {
                    return;
                }
                path.remove(path.size() - 1);
            }
        }
    }
}
