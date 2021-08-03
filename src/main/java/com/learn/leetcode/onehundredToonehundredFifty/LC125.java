package com.learn.leetcode.onehundredToonehundredFifty;


/**
 * Description:
 * date: 2021/8/3 9:58
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC125 {

    public static void main(String[] args) {

    }

    /**
     * 验证回文串
     */
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }
}
