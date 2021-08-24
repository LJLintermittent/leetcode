package com.learn.leetcode.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * date: 2021/8/24 11:00
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer38 {

    public static void main(String[] args) {
        String s = "abc";
        offer38 offer38 = new offer38();
        String[] ans = offer38.permutation(s);
        System.out.println(Arrays.toString(ans));

    }

    List<String> res;

    boolean[] used;

    /**
     * 剑指 Offer 38. 字符串的排列
     */
    public String[] permutation(String s) {
        int len = s.length();
        res = new ArrayList<>();
        used = new boolean[len];
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuffer path = new StringBuffer();
        backtrack(chars, 0, len, path);
        int size = res.size();
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    private void backtrack(char[] chars, int i, int len, StringBuffer path) {
        if (i == len) {
            res.add(path.toString());
            return;
        }
        for (int j = 0; j < len; j++) {
            if (used[j] || (j > 0 && !used[j - 1] && chars[j - 1] == chars[j])) {
                continue;
            }
            used[j] = true;
            path.append(chars[j]);
            backtrack(chars, i + 1, len, path);
            path.deleteCharAt(path.length() - 1);
            used[j] = false;
        }
    }
}
