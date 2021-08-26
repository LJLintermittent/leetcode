package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/26 11:25
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer05 {

    public static void main(String[] args) {

    }

    /**
     * 替换空格
     */
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();

    }
}
