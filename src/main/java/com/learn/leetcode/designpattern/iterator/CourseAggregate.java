package com.learn.leetcode.designpattern.iterator;

/**
 * Description:
 * date: 2021/9/15 10:36
 * Package: com.learn.leetcode.designpattern.iterator
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public interface CourseAggregate {

    void add(Course course);

    void remove(Course course);

    Iterator<Course> iterator();

}
