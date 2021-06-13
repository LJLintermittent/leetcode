package com.learn.leetcode;


/**
 * Description:
 * date: 2021/4/3 21:01
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LC5 {
    public static void main(String[] args) {
        String s = "cbbd";
        String s1 = longestPalindrome2(s);
        System.out.println(s1);
    }

    /**
     * 最长回文子串
     *
     * @param s 原字符串
     * @return 最长回文子串
     */
    public static String longestPalindrome(String s) {
        int max = 0;
        String ans = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindrome(test) && test.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String longestPalindrome2(String s) {
        if (s.length() == 0) {
            return s;
        }
        int res = 1;
        int ll = 0;
        int rr = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i - 1;
            int r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int len = (r - l + 1);
                if (len > res) {
                    res = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int len = (r - l + 1);
                if (len > res) {
                    res = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }
        }
        return s.substring(ll, rr + 1);
    }
}
