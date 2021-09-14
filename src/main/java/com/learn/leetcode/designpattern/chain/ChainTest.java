package com.learn.leetcode.designpattern.chain;

/**
 * Description:
 * date: 2021/9/14 14:14
 * Package: com.learn.leetcode.designpattern.chain
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class ChainTest {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("李佳乐","123");
    }
}
