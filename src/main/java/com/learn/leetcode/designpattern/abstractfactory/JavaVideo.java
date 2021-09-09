package com.learn.leetcode.designpattern.abstractfactory;

/**
 * Description:
 * date: 2021/9/9 13:21
 * Package: com.learn.leetcode.designpattern.abstractfactory
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class JavaVideo implements IVideo{

    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
