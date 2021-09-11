package com.learn.leetcode.designpattern.facade;

/**
 * Description:
 * date: 2021/9/11 17:54
 * Package: com.learn.leetcode.designpattern.facade
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class QualifyService {

    public boolean isAvailable(GiftInfo giftInfo){
        System.out.println("检验" + giftInfo.getName() + " 积分资格通过，库存通过");
        return true;
    }
}
