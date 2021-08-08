package com.learn.leetcode.week.week3;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/8/7 22:32
 * Package: com.learn.leetcode.week.week3
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Solution1 {
    public static void main(String[] args) {

        String s = "leeetcode";
        String s1 = "aaabaaaa";
        String ans = makeFancyString(s1);
        System.out.println(ans);

    }

    /**
     * 删除字符使字符串变好
     * 模拟
     */
    public static String makeFancyString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        if (s.length() <= 2) {
            return s;
        }
        stringBuilder.append(s.charAt(0));
        int count = 1;
        char k = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != k) {
                count = 1;
                k = s.charAt(i);
                stringBuilder.append(s.charAt(i));
            } else if (count < 2) {
                stringBuilder.append(s.charAt(i));
                count++;
            }
        }
        return stringBuilder.toString();
    }

    private static StringBuilder stringBuilder = new StringBuilder();

    public static String makeFancyString1(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        helper(s, 1);
        return stringBuilder.toString();
    }

    public static void helper(String s, int i) {
        while (i <= s.length() - 1) {
            StringBuilder sb = new StringBuilder();
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i - 1)) {
                sb.append(s.charAt(i - 1));
                i++;
            }
            if (sb.length() == 0) {
                sb.append(s.charAt(i));
                i++;
            } else {
                sb.append(s.charAt(i - 1));
            }
            if (sb.length() <= 2) {
                stringBuilder.append(sb);
            } else {
                stringBuilder.append(sb.subSequence(0, 2));
            }
        }
    }

    public static String makeFancyString2(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>(16);
        sb.append(s.charAt(0));
        int count = 1;
        map.put(s.charAt(0), count);
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), count);
                }
            } else if (s.charAt(i) == s.charAt(i - 1) && map.get(s.charAt(i - 1)) == 2) {
                continue;
            } else if (s.charAt(i) == s.charAt(i - 1) && map.get(s.charAt(i - 1)) < 2) {
                sb.append(s.charAt(i));
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), count);
                }
            }
        }
        return sb.toString();
    }
}
