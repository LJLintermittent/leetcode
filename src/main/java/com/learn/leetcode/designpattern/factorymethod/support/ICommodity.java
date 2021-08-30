package com.learn.leetcode.designpattern.factorymethod.support;

import java.util.Map;

/**
 * Description:
 * date: 2021/8/30 12:00
 * Package: com.learn.leetcode.designpattern.factorymethod.support
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
