package com.learn.leetcode.designpattern.facade;

/**
 * Description:
 * date: 2021/9/11 18:01
 * Package: com.learn.leetcode.designpattern.facade
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class FacadeTest {

    /**
     * TODO 门面模式
     * 门面模式又叫外观模式，提供了一个统一的接口，这个接口不是interface那个接口，是API接口
     * 将各种功能整合到一个外观类中，使用外观类来访问各种子系统的一群接口
     * 门面模式的主要特征就是定义一个高层接口，让子系统更容易被使用，属于结构性设计模式
     * 其实在日常开发中，门面是使用比较多的，而且是不知不觉中使用的，比如对各个接口封装起来统一使用
     * 门面的优点是：
     * 1.简化了调用过程，不用深入了解子系统，以防给子系统带来风险
     * 2.减少了系统的依赖，松散耦合
     * 3.更好的划分层次
     * 4.迪米特法则，最小知道原则
     * <p>
     * 最小知道有一个风险，当子系统发生改变的时候，可能带来未知的风险
     * 不符合开闭原则，对扩展开放，对修改关闭
     *
     * 在mybatis的configuration类中，就使用到了门面模式
     */

    public static void main(String[] args) {
        GiftInfo giftInfo = new GiftInfo("《阿里巴巴》");
        GiftFacadeService facadeService = new GiftFacadeService();
        facadeService.exchange(giftInfo);
    }
}
