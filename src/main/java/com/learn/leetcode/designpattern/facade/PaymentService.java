package com.learn.leetcode.designpattern.facade;

/**
 * Description:
 * date: 2021/9/11 17:55
 * Package: com.learn.leetcode.designpattern.facade
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class PaymentService {

    public boolean pay(GiftInfo giftInfo){
        System.out.println("支付" + giftInfo.getName() + " 积分通过");
        return true;
    }

}
