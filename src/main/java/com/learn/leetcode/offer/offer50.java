package com.learn.leetcode.offer;


import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/8/27 10:59
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer50 {

    public static void main(String[] args) {
        String s = "acaadcad";
        char ans = firstUniqChar(s);
        System.out.println(ans);

    }

    /**
     * 第一个只出现一次的字符
     */
    public static char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
