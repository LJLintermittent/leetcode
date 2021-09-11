package com.learn.leetcode.designpattern.facade;

/**
 * Description:
 * date: 2021/9/11 17:57
 * Package: com.learn.leetcode.designpattern.facade
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class ShippingService {

    public String delivery(GiftInfo giftInfo) {
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shippingNumber = "123";
        return shippingNumber;
    }

}
