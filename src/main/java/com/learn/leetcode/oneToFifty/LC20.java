package com.learn.leetcode.oneToFifty;

/**
 * Description:
 * date: 2021/6/28 14:47
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC20 {

    public static void main(String[] args) {
        String s = "([)]";
        boolean valid = isValid1(s);
        System.out.println(valid);

    }

    /**
     * 有效的括号
     */
    public static boolean isValid(String s) {
        if (s.length() == 0 || s == null) {
            return false;
        }
        char[] c = s.toCharArray();
        if (c.length % 2 != 0) {
            return false;
        }
        //()[]{}
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < c.length / 2; i++) {
            s1.append(c[i]);// ()[
        }
        for (int j = c.length / 2; j < c.length; j++) {
            s2.append(c[j]);// ]{}
        }
        return false;
    }

    /**
     * 暴力替换
     */
    public static boolean isValid1(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            }
            if (s.contains("{}")) {
                s = s.replace("{}", "");
            }
            if (s.contains("[]")) {
                s = s.replace("[]", "");
            }
        }
        return s.length() == 0;
    }
}
