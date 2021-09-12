package com.learn.leetcode.designpattern.adapter;

/**
 * Description:
 * date: 2021/9/12 20:12
 * Package: com.learn.leetcode.designpattern.adapter
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class PowerAdapter extends AC220 implements DC5 {

    /**
     * TODO 适配器模式
     * 适配器模式的核心功能是将一个类的接口（API接口，也就是具体的方法）变成客户端所期望的另一种接口，从而使原本
     * 因接口不匹配而导致无法在一起工作的两个类能够在一起工作，属于结构性设计模式
     *
     * 适配器模式在spring源码中的应用：
     * advisorAdapter类
     */

    @Override
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用适配器输入AC：" + adapterInput + "V,输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
