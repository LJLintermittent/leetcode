package com.learn.leetcode.onethousandTomore;

/**
 * Description:
 * date: 2021/7/22 19:57
 * Package: com.learn.leetcode.onethousandTomore
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC1047 {

    public static void main(String[] args) {
        String s = "abbaca";
        String s1 = "bbadceff";
        String s2 = "a";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String ans = removeDuplicates1(s);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start));

    }

    /**
     * 删除字符串中的所有相邻重复项
     * 题解
     * 栈
     */
    public static String removeDuplicates1(String s) {
        StringBuilder sb = new StringBuilder();
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (top >= 0 && sb.charAt(top) == c) {
                sb.deleteCharAt(top);
                top--;
            } else {
                sb.append(c);
                top++;
            }
        }
        return sb.toString();
    }

    /**
     * 删除字符串中的所有相邻重复项
     * 递归超时
     */
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.delete(i, j + 1);
                    return removeDuplicates(sb.toString());
                }
                break;
            }
        }
        return sb.toString();
    }
}
