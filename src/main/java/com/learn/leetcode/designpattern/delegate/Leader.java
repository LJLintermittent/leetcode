package com.learn.leetcode.designpattern.delegate;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:
 * date: 2021/9/13 11:23
 * Package: com.learn.leetcode.designpattern.delegate
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Leader implements IEmployee {

    /**
     * TODO 委派模式
     * 核心是对象组合实现与继承相同的代码复用
     * 基本作用是负责任务的调用和分配
     * 通过某一个中间类来使用构造器注入的方式，来使用这个注入的类，达到了和继承一样的效果
     * 委派属于行为型设计模式，但不属于GOF23种设计模式之一
     */

    private Map<String, IEmployee> EmployeeMap = new ConcurrentHashMap<>(16);

    public Leader() {
        EmployeeMap.put("业务", new EmployeeA());
        EmployeeMap.put("做报告", new EmployeeB());
    }

    @Override
    public void doSomething(String task) {
        if (!EmployeeMap.containsKey(task)) {
            System.out.println("这个任务" + task + "超出任何一个员工的能力范围");
            return;
        }
        EmployeeMap.get(task).doSomething(task);
    }
}
