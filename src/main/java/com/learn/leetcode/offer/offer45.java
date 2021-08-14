package com.learn.leetcode.offer;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/8/14 14:08
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer45 {

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};

        String s = minNumber(nums);
        System.out.println(s);
    }

    /**
     * 剑指 Offer 45. 把数组排成最小的数
     */
    public static String minNumber(int[] nums) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // (o1 + o2).compareTo(o2 + o1) 返回的是len1 - len2 len2是compareTo(o2 + o1)括号里的长度
                // 字典序列小的放在堆顶
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        for (int num : nums) {
            queue.add(String.valueOf(num));
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        return sb.toString();
    }
}
