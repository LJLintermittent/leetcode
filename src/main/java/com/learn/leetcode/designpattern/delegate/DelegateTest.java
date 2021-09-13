package com.learn.leetcode.designpattern.delegate;

/**
 * Description:
 * date: 2021/9/13 11:28
 * Package: com.learn.leetcode.designpattern.delegate
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class DelegateTest {

    public static void main(String[] args) {
        new Boss().command("业务",new Leader());
        new Boss().command("做报告", new Leader());
        new Boss().command("xxx", new Leader());

    }
}
