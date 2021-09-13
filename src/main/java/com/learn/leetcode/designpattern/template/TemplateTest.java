package com.learn.leetcode.designpattern.template;

/**
 * Description:
 * date: 2021/9/13 12:07
 * Package: com.learn.leetcode.designpattern.template
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TemplateTest {

    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomeWork(false);
        javaCourse.createCourse();

        System.out.println("---------------------------------");

        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();
    }
}
