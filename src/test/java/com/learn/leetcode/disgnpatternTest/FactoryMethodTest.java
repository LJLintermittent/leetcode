package com.learn.leetcode.disgnpatternTest;

import com.learn.leetcode.designpattern.factorymethod.support.ICommodity;
import com.learn.leetcode.designpattern.factorymethod.support.StoreFactory;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/8/30 12:05
 * Package: com.learn.leetcode.disgnpatternTest
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class FactoryMethodTest {

    @Test
    public void test_FactoryMethod() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        Map<String, String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName", "1111");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "陕西省西安市莲湖区");

        commodityService_2.sendCommodity("10001", "9820198721311", "1023000020112221113", new HashMap<String, String>() {{
            put("consigneeUserName", "李佳乐");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "陕西省西安市莲湖区");
        }});

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001", "AQY1xjkUodl8LO975GdfrYUio", null, null);
    }
}
