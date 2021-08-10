package com.learn.leetcode.fourhundredTofivehundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/16 21:24
 * Package: com.learn.leetcode.fourhundredTofivehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC443 {

    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int i = compress2(chars);
        System.out.println(i);
    }

    /**
     * 压缩字符串
     * 滑动窗口
     */
    public static int compress1(char[] chars) {
        int left = 0;
        int size = 0;
        // 由于最后一个字符也需要判断，所以将右指针终点放到数组之外一格
        for (int right = 0; right <= chars.length; right++) {
            // 当遍历完成，或右指针元素不等于左指针元素时，更新数组
            if (right == chars.length || chars[right] != chars[left]) {
                chars[size++] = chars[left]; // 更新字符
                if (right - left > 1) {
                    for (char c : String.valueOf(right - left).toCharArray()) {
                        chars[size++] = c;
                    }
                }
                left = right;
            }
        }
        return size;
    }

    public static int compress2(char[] chars) {
        int left = 0;
        int size = 0;
        for (int right = 0; right <= chars.length; right++) {
            if (right == chars.length || chars[right] != chars[left]) {
                chars[size++] = chars[left];
                if (right - left > 1) {
                    for (char c : String.valueOf(right - left).toCharArray()) {
                        chars[size++] = c;
                    }
                }
                left = right;
            }
        }
        return size;
    }

    /**
     * 压缩字符串
     * 测试
     */
    public static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        if (chars.length == 0) {
            return 0;
        }
        for (int i = 0; i < chars.length; i++) {
            int flag = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    flag = flag + 1;
                    char charflag = (char) flag;
                    chars[j] = charflag;
                    if (flag > 2) {
                        chars = Arrays.copyOf(chars, chars.length - 1);
                    }
                } else if (chars[i] != chars[j]) {
                    flag = 1;
                }
            }
        }
        return chars.length;
    }
}
