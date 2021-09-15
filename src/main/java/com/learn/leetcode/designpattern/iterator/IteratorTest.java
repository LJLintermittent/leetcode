package com.learn.leetcode.designpattern.iterator;


import java.util.ArrayList;

/**
 * Description:
 * date: 2021/9/15 10:25
 * Package: com.learn.leetcode.designpattern.Iterator
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class IteratorTest {

    /**
     * TODO 迭代器模式
     * 迭代器模式又叫游标模式，提供一种按照顺序访问集合容器对象元素的方法，而又无需暴露集合内部表示
     * 迭代器模式可为不同的容器提供一致的遍历行为，不用关心容器内元素的组成结构，属于行为型设计模式
     * 迭代器模式封装了具体的迭代算法，迭代算法的变化不会影响到集合对象的架构
     */

    public static void main(String[] args) {
        new ArrayList<>();
        Course course1 = new Course("java");
        Course course2 = new Course("C++");
        Course course3 = new Course("python");
        Course course4 = new Course("mysql");
        CourseAggregateImpl courseAggregate = new CourseAggregateImpl();
        courseAggregate.add(course1);
        courseAggregate.add(course2);
        courseAggregate.add(course3);
        courseAggregate.add(course4);
        System.out.println("课程列表---------------");
        printCourseList(courseAggregate);

        courseAggregate.remove(course1);
        System.out.println("删除之后的列表--------------");
        printCourseList(courseAggregate);

    }

    public static void printCourseList(CourseAggregate courseAggregate) {
        Iterator<Course> iterator = courseAggregate.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println("《" + course.getName() + "》");
        }

    }

}
