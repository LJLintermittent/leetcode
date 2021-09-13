package com.learn.leetcode.designpattern.template;


/**
 * Description:
 * date: 2021/9/13 12:02
 * Package: com.learn.leetcode.designpattern.template
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class JavaCourse extends abstractCourse {

    private boolean needCheckHomeWork = false;

    public void setNeedCheckHomeWork(boolean needCheckHomeWork) {
        this.needCheckHomeWork = needCheckHomeWork;
    }

    @Override
    protected boolean needCheckHomeWork() {
        return this.needCheckHomeWork;
    }

    @Override
    protected void checkHomeWork() {
        System.out.println("检查Java");
    }
}
