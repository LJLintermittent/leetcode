package com.learn.leetcode;


/**
 * Description:
 * date: 2021/4/20 1:06
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
public class LC10 {
    public static void main(String[] args) {
        String s = "aab";
        String p = "c*a*b";
        boolean ans = isMatch(s, p);
        System.out.println(ans);
    }

    public static boolean isMatch(String s, String p) {
        char[] str = s.toCharArray();
        char[] ptr = p.toCharArray();
        boolean[][] dp = new boolean[str.length + 1][ptr.length + 1];
        dp[0][0] = true;
        for (int i = 0; i <= str.length; i++) {
            for (int j = 1; j <= ptr.length; j++) {
                if (ptr[j - 1] != '*') {
                    if (i > 0 && (str[i - 1] == ptr[j - 1] || ptr[j - 1] == '.')) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                } else { //ptr[j - 1] == '*'
                    if (j > 1) dp[i][j] |= dp[i][j - 2];   //不看
                    if (i > 0 && j > 1 && (str[i - 1] == ptr[j - 2] || ptr[j - 2] == '.')) {
                        dp[i][j] |= dp[i - 1][j];    //看
                    }
                }
            }
        }
        return dp[str.length][ptr.length];
    }


}
