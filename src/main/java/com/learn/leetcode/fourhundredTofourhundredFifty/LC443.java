package com.learn.leetcode.fourhundredTofourhundredFifty;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/16 21:24
 * Package: com.learn.leetcode.fourhundredTofourhundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC443 {

    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int i = compress(chars);
        System.out.println(i);
    }

    /**
     * 压缩字符串
     *
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
