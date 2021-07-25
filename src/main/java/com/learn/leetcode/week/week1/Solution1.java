package com.learn.leetcode.week.week1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Description:
 * date: 2021/7/24 22:31
 * Package: com.learn.leetcode.week
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Solution1 {

    public static void main(String[] args) {
        String s = "ababcc";
        boolean ans = areOccurrencesEqual(s);
        System.out.println(ans);
    }

    /**
     * 检查是否所有字符出现次数相同
     * <p>
     * 给你一个字符串 s ，如果 s 是一个 好 字符串，请你返回 true ，否则请返回 false 。
     * 如果 s 中出现过的 所有 字符的出现次数 相同 ，那么我们称字符串 s 是 好 字符串。
     */
    public static boolean areOccurrencesEqual(String s) {
        // "aaabb"
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>(16);
        int count = 1;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                count = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), count);
                count = 1;
                continue;
            }
            map.put(s.charAt(i), count);
            count = 1;
        }
        HashSet<Integer> set = new HashSet<>(16);
        for (Integer value : map.values()) {
            set.add(value);
        }
        if (set.size() == 1) {
            return true;
        } else {
            return false;
        }
    }
}


