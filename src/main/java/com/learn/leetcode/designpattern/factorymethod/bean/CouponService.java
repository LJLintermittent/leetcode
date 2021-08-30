package com.learn.leetcode.designpattern.factorymethod.bean;

/**
 * Description:
 * date: 2021/8/30 11:57
 * Package: com.learn.leetcode.designpattern.factorymethod.bean
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
