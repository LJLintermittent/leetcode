package com.learn.leetcode.designpattern.template;

/**
 * Description:
 * date: 2021/9/13 11:54
 * Package: com.learn.leetcode.designpattern.template
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public abstract class abstractCourse {

    /**
     * TODO 模板方法
     * 定义一个操作中的算法框架，而将算法中的具体的某些步骤交个该抽象类的子类去实现，也有一些方法可以直接在抽象类中做实现
     * 在子类中，可以任意对方法做一个实现，而不会破坏抽象类中定义好的算法框架
     * 模板方法属于行为型设计模式
     * 本质就是抽象封装流程，具体实现类来做实现
     * 优点是利用模板方法将相同处理逻辑的代码放到抽象父类中，提高代码的复用性
     * 将不同算法的逻辑交给对应的子类，通过对具体的子类做扩展，提高整体 的扩展
     * 不变的行为写在父类，变的写在子类 符合开闭原则
     * 缺点是会导致系统中类的数量增加
     */
    public final void createCourse() {

        postPreResource();

        createPPT();

        liveVideo();

        postResource();

        postHomeWork();

        if (needCheckHomeWork()) {
            checkHomeWork();
        }

    }

    protected abstract void checkHomeWork();

    /**
     * 钩子方法，用来干预执行流程的
     */
    protected boolean needCheckHomeWork() {
        return false;
    }

    protected void postHomeWork() {
        System.out.println("布置作业");
    }

    protected void postResource() {
        System.out.println("上传课后资料");
    }

    protected void liveVideo() {
        System.out.println("直播授课");
    }

    protected void createPPT() {
        System.out.println("制作课件");
    }

    protected void postPreResource() {
        System.out.println("发布预习课件");
    }

}
