package com.learn.leetcode.designpattern.delegate;

/**
 * Description:
 * date: 2021/9/13 11:29
 * Package: com.learn.leetcode.designpattern.delegate
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class Boss {

    public void command(String task, Leader leader) {
        leader.doSomething(task);
    }

}
