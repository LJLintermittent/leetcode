package com.learn.leetcode.onehundredToonehundredFifty;

import java.util.*;

/**
 * Description:
 * date: 2021/7/24 9:00
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC140 {

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("cats");
        list.add("and");
        list.add("sand");
        list.add("dog");

        LC140 lc140 = new LC140();

        List<String> ans = lc140.wordBreak(s, list);
        System.out.println(ans);
    }

    /**
     * 单词拆分Ⅱ
     * 回溯
     */
    List<String> ans = new ArrayList<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        backtrack(0, s, wordDict, new ArrayList<>());
        return ans;
    }

    private void backtrack(int len, String s, List<String> wordDict, List<String> cur) {
        if (len >= s.length()) {
            ans.add(String.join(" ", cur));
            return;
        }
        for (String word : wordDict) {
            if (len + word.length() <= s.length() && s.substring(len, len + word.length()).equals(word)) {
                cur.add(word);
                backtrack(len + word.length(), s, wordDict, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }

    /**
     * 单词拆分Ⅱ
     */
    public static List<String> wordBreak1(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        int len = s.length();
        //dp[i]表示长度为i的s前缀子串是否可以拆分成字典中的单词
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int right = 1; right <= len; right++) {
            for (int left = right - 1; left >= 0; left--) {
                if (set.contains(s.substring(left, right)) && dp[left]) {
                    dp[right] = true;
                    break;
                }
            }
        }
        List<String> res = new ArrayList<>(10);
        if (dp[len]) {
            Deque<String> path = new ArrayDeque<>();
            dfs(s, len, set, dp, path, res);
            return res;
        }
        return res;
    }

    //path :从叶子节点到根节点的路径
    private static void dfs(String s, int len, HashSet<String> set, boolean[] dp, Deque<String> path, List<String> res) {
        if (len == 0) {
            res.add(String.join(" ", path));
            return;
        }
        for (int i = len - 1; i >= 0; i--) {
            String suffix = s.substring(i, len);
            if (set.contains(suffix) && dp[i]) {
                path.addFirst(suffix);
                dfs(s, i, set, dp, path, res);
                path.removeFirst();
            }
        }
    }
}
