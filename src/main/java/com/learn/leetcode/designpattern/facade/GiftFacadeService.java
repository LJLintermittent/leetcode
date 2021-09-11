package com.learn.leetcode.designpattern.facade;

/**
 * Description:
 * date: 2021/9/11 17:58
 * Package: com.learn.leetcode.designpattern.facade
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class GiftFacadeService {

    private QualifyService qualifyService = new QualifyService();

    private PaymentService paymentService = new PaymentService();

    private ShippingService shippingService = new ShippingService();

    public void exchange(GiftInfo giftInfo) {
        if (qualifyService.isAvailable(giftInfo)) {
            if (paymentService.pay(giftInfo)) {
                String orderNo = shippingService.delivery(giftInfo);
                System.out.println("兑换成功，订单号为：" + orderNo);
            }
        }
    }

}
