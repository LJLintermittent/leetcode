package com.learn.leetcode.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/9/14 13:06
 * Package: com.learn.leetcode.designpattern.strategy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class PayStrategy {

    /**
     * TODO 策略模式 行为型设计模式
     * 策略模式将算法家族分别封装起来，让他们之间可以互相替换，从而让算法的变化不会影响到使用算法的用户
     * 属于行为型设计模式，玩的是面向对象的继承和多态机制，从而实现同一行为在不同的场景具备不同的实现
     * spring源码中的Bean的实例化策略，就使用了策略模式，Bean的实例化有两种实现方式，分别是simple实例化策略和
     * cglib实例化策略
     * spring的Resource类，资源加载器类，也是策略模式，可以根据类路径解析，云文件url解析，本地文件等方式解析
     * 策略模式符合开闭原则，避免使用多重条件转移语句，if_else switch_case等使代码臃肿
     *
     * 提高算法的保密性和安全性
     *
     */
    public static final String ALI_PAY = "AliPay";

    public static final String JD_PAY = "JDPay";

    public static final String WECHAT_PAY = "WeChatPay";

    public static final String DEFAULT_PAY = "ALI_PAY";

    private static Map<String, Payment> strategy = new HashMap<>(16);

    static {
        strategy.put(ALI_PAY, new AliPay());
        strategy.put(JD_PAY, new JDPay());
        strategy.put(WECHAT_PAY, new WeChatPay());
        strategy.put(DEFAULT_PAY, new AliPay());
    }

    public static Payment get(String payKey) {
        if (!strategy.containsKey(payKey)) {
            return strategy.get(DEFAULT_PAY);
        }
        return strategy.get(payKey);
    }

}
