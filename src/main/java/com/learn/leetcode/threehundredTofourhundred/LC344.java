package com.learn.leetcode.threehundredTofourhundred;


/**
 * Description:
 * date: 2021/8/10 9:45
 * Package: com.learn.leetcode.threehundredTofourhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC344 {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s1 = {'h', 'a', 'n', 'n', 'a','h'};

        reverseString(s1);
        System.out.println(s1);
    }

    /**
     * 反转字符串
     */
    public static void reverseString(char[] s) {
        if (s.length == 0 || s.length == 1) {
            return;
        }
        for (int i = 0; i < s.length / 2; i++) {
            swap(s, i, s.length - 1 - i);
        }
    }

    public static void swap(char[] s, int i, int j) {
        char temp;
        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
