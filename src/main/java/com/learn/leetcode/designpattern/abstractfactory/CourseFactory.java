package com.learn.leetcode.designpattern.abstractfactory;

/**
 * Description:
 * date: 2021/9/9 13:18
 * Package: com.learn.leetcode.designpattern.abstractfactory
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public abstract class CourseFactory {

    public void init(){
        System.out.println("初始化数据");
    }

    protected abstract INote createNode();

    protected abstract IVideo createVideo();

}
