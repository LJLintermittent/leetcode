package com.learn.leetcode.onehundredFiftyToTwohundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/19 10:42
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC179 {

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        String s = largestNumber1(nums);
        System.out.println(s);

    }


    /**
     * 按字典顺序比较两个字符串。 比较基于字符串中每个字符的 Unicode 值。
     * 此String对象表示的字符序列按字典顺序与参数字符串表示的字符序列进行比较。
     * 如果此String对象按字典顺序位于参数字符串之前，则结果为负整数。
     * 如果此String对象按字典顺序跟在参数字符串之后，则结果为正整数。
     * 如果字符串相等，则结果为零； 当equals(Object)方法返回true时， compareTo返回0 。
     * 这是字典排序的定义。 如果两个字符串不同，那么它们要么在对两个字符串都是有效索引的某个索引处具有不同的字符，
     * 要么它们的长度不同，或者两者都有。 如果它们在一个或多个索引位置有不同的字符，则令k为最小的此类索引；
     * 则在位置k处的字符具有较小值的字符串（通过使用 < 运算符确定）按字典顺序排在另一个字符串之前。
     * 在这种情况下， compareTo返回两个字符串中位置k处的两个字符值的差——即值：
     *        this.charAt(k)-anotherString.charAt(k)
     *
     * 如果没有它们不同的索引位置，则较短的字符串按字典顺序排在较长的字符串之前。
     * 在这种情况下， compareTo返回字符串长度的差值——即值：
     *        this.length()-anotherString.length()
     *
     * 参数：
     * anotherString – 要比较的String 。
     * 返回：
     * 如果参数字符串等于此字符串，则值为0 ； 如果此字符串按字典顺序小于字符串参数，则为小于0的值；
     * 如果此字符串按字典顺序大于字符串参数，则为大于0的值。
     */

    /**
     * 最大数
     */
    public static String largestNumber(int[] nums) {
        int len = nums.length;
        String[] s = new String[len];
        for (int i = 0; i < len; i++) {
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a, b) -> {
            return (b + a).compareTo(a + b);
        });
        StringBuilder stringBuilder = new StringBuilder();
        if (s[0].equals("0")) {
            return "0";
        }
        for (int i = 0; i < len; i++) {
            stringBuilder.append(s[i]);
        }
        return stringBuilder.toString();
    }


    public static String largestNumber1(int[] nums) {
        String[] array = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = String.valueOf(nums[i]);
        }
        quickSort(array, 0, nums.length - 1);
        if (array[0].equals("0")) {
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        for (String str : array) {
            ans.append(str);
        }
        return ans.toString();

    }

    private static void quickSort(String[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        String pivot = nums[start];
        int index = start;
        for (int i = start + 1; i <= end; i++) {
            if ((nums[i] + pivot).compareTo(pivot + nums[i]) > 0) {
                index += 1;
                swap(nums, index, i);
            }
        }
        swap(nums, index, start);
        quickSort(nums, start, index - 1);
        quickSort(nums, index + 1, end);
    }

    private static void swap(String[] nums, int l, int r) {
        String temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;

    }

}
