package com.learn.leetcode.fiftyToOnehundred;

/**
 * Description:
 * date: 2021/8/5 14:45
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC76 {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String window = minWindow(s, t);
        System.out.println(window);

    }

    /**
     * 最小覆盖子串
     */
    public static String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }
        if (s.length() < t.length()) {
            return "";
        }
        int[] need = new int[128];
        //定义字符数组,注意保存的字符相等于下标i,比如保存了'A',相当于need[65] = 1
        for (int i = 0; i < t.length(); i++) {
            //保存所需要的字符个数,也即对应的ASCII码作为下标的值
            need[t.charAt(i)] = need[t.charAt(i)] + 1;
        }
        int l = 0;
        int r = 0;
        int size = Integer.MAX_VALUE;//窗口大小
        int count = t.length();//我们需要的字符的数量
        int start = 0;//滑动窗口的开始点
        while (r < s.length()) {
            char c = s.charAt(r);
            //说明这个字符我们需要
            if (need[c] > 0) {
                count--;
            }
            //这一步每次都会走到，意思是不是我们需要的，那就减少，最终会成负的
            need[c]--;
            //如果count为0了，表示当前的窗口已经满足了包含t字符串的字符，那么我们需要最小的，就开始要缩短窗口了
            if (count == 0) {
                //去掉多余的字符，缩减窗口，直到碰到我们必须需要的字符就停止
                while (l < r && need[s.charAt(l)] < 0) {
                    need[s.charAt(l)]++;
                    l++;
                }
                //到这一步表示已经缩到极限了，此时记录一下窗口大小（min）
                if (r - l + 1 < size) {
                    size = r - l + 1;
                    start = l;
                }
                //这时候将左边界右移，同时也必须加上一个count，因为移完以后肯定有不满足了，就需要把需要的这个元素++
                need[s.charAt(l)]++;
                l++;
                count++;
            }
            //没有遇到满足的条件，就扩大窗口向右移动
            r++;
        }
        return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);
    }
}
