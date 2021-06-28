package com.learn.leetcode.onehundredFiftyToTwohundred;

/**
 * Description:
 * date: 2021/6/28 13:29
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC165 {
    public static void main(String[] args) {
        String s1 = "1.2.3";
        String s2 = "1.2.1";
        int i = compareVersion(s1, s2);
        System.out.println(i);

    }

    /**
     * 比较版本号
     */
    public static int compareVersion(String version1, String version2) {
        String[] v1s = version1.split("\\.");
        String[] v2s = version2.split("\\.");
        int length1 = v1s.length;//3
        int length2 = v2s.length;//3
        int i1, i2;
        for (int i = 0; i < Math.max(length1, length2); ++i) {
            i1 = i < length1 ? Integer.parseInt(v1s[i]) : 0;//1 2 3
            i2 = i < length2 ? Integer.parseInt(v2s[i]) : 0;//1 2 1
            if (i1 != i2) {
                return i1 > i2 ? 1 : -1;
            }
        }
        return 0;
    }
}
