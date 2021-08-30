package com.learn.leetcode.designpattern.factorymethod.bean;

/**
 * Description:
 * date: 2021/8/30 11:57
 * Package: com.learn.leetcode.designpattern.factorymethod.bean
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
