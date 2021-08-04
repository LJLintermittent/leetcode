package com.learn.leetcode.twohundredTothreehundred;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Description:
 * date: 2021/8/4 13:55
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC242 {

    public static void main(String[] args) {
        String s  = "aaaa";
        String t =  "aabb";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);

    }

    /**
     * 有效的字母异位词
     * 异位词等价于两个字符串排序后相等
     * 哈希表
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if (map.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 有效的字母异位词
     * char数组排序
     */
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] Schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Arrays.sort(Schars);
        Arrays.sort(tchars);
        return Arrays.equals(Schars, tchars);
    }
}
