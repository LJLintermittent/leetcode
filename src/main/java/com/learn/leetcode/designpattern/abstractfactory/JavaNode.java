package com.learn.leetcode.designpattern.abstractfactory;

/**
 * Description:
 * date: 2021/9/9 13:20
 * Package: com.learn.leetcode.designpattern.abstractfactory
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class JavaNode implements INote{

    @Override
    public void edit() {
        System.out.println("编写java笔记");
    }
}


