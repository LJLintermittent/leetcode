package com.learn.leetcode.designpattern.delegate;

/**
 * Description:
 * date: 2021/9/13 11:22
 * Package: com.learn.leetcode.designpattern.delegate
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class EmployeeB implements IEmployee {

    protected String goodAt = "做PPT";

    @Override
    public void doSomething(String task) {
        System.out.println("员工B，擅长" + goodAt + ",现在开始做" + task + "工作");

    }
}
