package com.learn.leetcode.week.week2;


/**
 * Description:
 * date: 2021/7/25 10:29
 * Package: com.learn.leetcode.week.week2
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Solution1 {

    public static void main(String[] args) {
//        String s = "leetcode";
//        int i = getLucky2(s, 2);
//        System.out.println(i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");//97 - 48 = 49
        char c = stringBuilder.charAt(0);
        System.out.println(c - 48);
    }

    /**
     * 自己写
     */
    public static int getLucky2(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        for (int i = 1; i <= k; i++) {
            int ans = 0;
            for (int j = 0; j < sb.length(); j++) {
                ans = ans + sb.charAt(j) - 48;
            }
            StringBuilder newsb = new StringBuilder();
            newsb.append(ans);
            sb = newsb;
        }
        return Integer.parseInt(sb.toString());
    }


    /**
     * 字符串转化后的各位数字之和
     */
    public static int getLucky1(String s, int k) {
        StringBuilder sb = new StringBuilder();
        //先把每个字符转换为对应的数字
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        //进行k次转换，每次需要用变量sum进行统计下一轮的遍历字符串
        for (int i = 1; i <= k; i++) {
            int sum = 0;
            for (int j = 0; j < sb.length(); j++) {
                char c = sb.charAt(j);
                sum += c - '0';
            }
            //将本轮结果指定给下一次要遍历的变量sb
            StringBuilder newSb = new StringBuilder();
            newSb.append(sum);
            sb = newSb;
        }
        return Integer.parseInt(sb.toString());
    }

    /**
     * 字符串转化后的各位数字之和
     */
    public static int getLucky(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                stringBuilder.append(1);
            }
            if (s.charAt(i) == 'b') {
                stringBuilder.append(2);
            }
            if (s.charAt(i) == 'c') {
                stringBuilder.append(3);
            }
            if (s.charAt(i) == 'd') {
                stringBuilder.append(4);
            }
            if (s.charAt(i) == 'e') {
                stringBuilder.append(5);
            }
            if (s.charAt(i) == 'f') {
                stringBuilder.append(6);
            }
            if (s.charAt(i) == 'g') {
                stringBuilder.append(7);
            }
            if (s.charAt(i) == 'h') {
                stringBuilder.append(8);
            }
            if (s.charAt(i) == 'i') {
                stringBuilder.append(9);
            }
            if (s.charAt(i) == 'j') {
                stringBuilder.append(10);
            }
            if (s.charAt(i) == 'k') {
                stringBuilder.append(11);
            }
            if (s.charAt(i) == 'l') {
                stringBuilder.append(12);
            }
            if (s.charAt(i) == 'm') {
                stringBuilder.append(13);
            }
            if (s.charAt(i) == 'n') {
                stringBuilder.append(14);
            }
            if (s.charAt(i) == 'o') {
                stringBuilder.append(15);
            }
            if (s.charAt(i) == 'p') {
                stringBuilder.append(16);
            }
            if (s.charAt(i) == 'q') {
                stringBuilder.append(17);
            }
            if (s.charAt(i) == 'r') {
                stringBuilder.append(18);
            }
            if (s.charAt(i) == 's') {
                stringBuilder.append(19);
            }
            if (s.charAt(i) == 't') {
                stringBuilder.append(20);
            }
            if (s.charAt(i) == 'u') {
                stringBuilder.append(21);
            }
            if (s.charAt(i) == 'v') {
                stringBuilder.append(22);
            }
            if (s.charAt(i) == 'w') {
                stringBuilder.append(23);
            }
            if (s.charAt(i) == 'x') {
                stringBuilder.append(24);
            }
            if (s.charAt(i) == 'y') {
                stringBuilder.append(19);
            }
            if (s.charAt(i) == 'z') {
                stringBuilder.append(19);
            }
        }
        int[] nums = new int[stringBuilder.length()];
        for (int i = 0; i < stringBuilder.length(); i++) {
            nums[i] = stringBuilder.charAt(i) - 48;
        }
        int ans = 0;
        for (int j = 0; j < k; j++) {
            ans = 0;
            for (int i = 0; i < nums.length; i++) {
                //bug
                ans = ans + nums[i];
            }
            if (k == 1) {
                return ans;
            }
            stringBuilder.setLength(0);
            stringBuilder.append(ans);
            int[] n = new int[stringBuilder.length()];
            for (int m = 0; m < stringBuilder.length(); m++) {
                n[m] = stringBuilder.charAt(m) - 48;
            }
        }
        return ans;
    }
}
