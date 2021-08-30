package com.learn.leetcode.designpattern.factorymethod.support;

import com.alibaba.fastjson.JSON;
import com.learn.leetcode.designpattern.factorymethod.bean.IQiYiCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Description:
 * date: 2021/8/30 12:01
 * Package: com.learn.leetcode.designpattern.factorymethod.support
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class CardCommodityService implements ICommodity{

    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }
    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
