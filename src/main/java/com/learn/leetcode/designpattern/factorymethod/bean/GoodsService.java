package com.learn.leetcode.designpattern.factorymethod.bean;

import com.alibaba.fastjson.JSON;

/**
 * Description:
 * date: 2021/8/30 11:58
 * Package: com.learn.leetcode.designpattern.factorymethod.bean
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
