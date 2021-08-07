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

    public static String makeFancyString(String s) {
        return null;

    }

    public static String makeFancyString1(String s) {
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
