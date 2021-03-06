package com.learn.leetcode.oneToFifty;


import java.util.Arrays;

/**
 * Description:
 * date: 2021/4/2 0:42
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LC14 {
    public static void main(String[] args) {
        String[] strs = {"aafhtyh", "aac", "aacs"};
        LC14 lc14 = new LC14();
        String s = lc14.longestCommonPrefix(strs);
        System.out.println(s);
    }

    /**
     * 最长公共前缀
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        StringBuilder stringBuilder = new StringBuilder();
        int k = Math.min(strs[0].length(), strs[strs.length - 1].length());
        for (int i = 0; i < k; i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                stringBuilder.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
