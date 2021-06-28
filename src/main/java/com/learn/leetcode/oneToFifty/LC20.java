package com.learn.leetcode.oneToFifty;

import java.util.*;

/**
 * Description:
 * date: 2021/6/28 14:47
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC20 {

    public static void main(String[] args) {
        String s = "([)]";
        boolean valid = isValid(s);
        System.out.println(valid);

    }


    /**
     * 有效的括号
     * 栈+哈希表
     */
    public static boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>(10);
        //哈希表 键：右括号  值：左括号
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            //哈希表中有这个键,代表已经遇到了右括号
            if (map.containsKey(c)) {
                //判断栈顶元素是否与这个右括号对应的左括号相等
                //如果相等，那么匹配成功了一组，就要弹出去，来改变栈顶元素 ，让后面的再继续匹配
                //因为先加入的左括号一定在后面的左括号后面进行匹配（匹配就是闭合的意思）
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    /**
     * 暴力替换
     */
    public static boolean isValid1(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            }
            if (s.contains("{}")) {
                s = s.replace("{}", "");
            }
            if (s.contains("[]")) {
                s = s.replace("[]", "");
            }
        }
        return s.length() == 0;
    }

    public static boolean isValid2(String s) {
        if (s.length() == 0 || s == null) {
            return false;
        }
        char[] c = s.toCharArray();
        if (c.length % 2 != 0) {
            return false;
        }
        //()[]{}
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < c.length / 2; i++) {
            s1.append(c[i]);// ()[
        }
        for (int j = c.length / 2; j < c.length; j++) {
            s2.append(c[j]);// ]{}
        }
        return false;
    }
}
