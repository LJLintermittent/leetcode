package com.learn.leetcode.designpattern.strategy;

/**
 * Description:
 * date: 2021/9/14 13:13
 * Package: com.learn.leetcode.designpattern.strategy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(){
        System.out.println("无参构造");
    }

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println("本次使用" + payment.getName() + "支付");
        System.out.println("本次交易金额为：" + amount + "元，开始扣款");
        return payment.pay(uid, amount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "uid='" + uid + '\'' +
                ", orderId='" + orderId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
