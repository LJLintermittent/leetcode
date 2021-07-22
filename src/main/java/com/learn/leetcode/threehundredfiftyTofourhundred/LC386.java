package com.learn.leetcode.threehundredfiftyTofourhundred;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/7/22 22:39
 * Package: com.learn.leetcode.threehundredfiftyTofourhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC386 {

    public static void main(String[] args) {
        List<Integer> list = lexicalOrder(13);
        System.out.println(list);
    }

    /**
     * 字典序排数
     */
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>(10);
        for (int i = 1; i < 10; i++) {
            dfs(n, i, res);
        }
        return res;
    }

    private static void dfs(int n, int target, List<Integer> list) {
        if (target > n) {
            return;
        }
        list.add(target);
        target = target * 10;
        for (int i = 0; i < 10; i++) {
            dfs(n, target + i, list);
        }
    }
}
