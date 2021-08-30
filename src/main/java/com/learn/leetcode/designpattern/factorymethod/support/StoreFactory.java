package com.learn.leetcode.designpattern.factorymethod.support;

/**
 * Description:
 * date: 2021/8/30 12:04
 * Package: com.learn.leetcode.designpattern.factorymethod.support
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
