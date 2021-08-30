package com.learn.leetcode.designpattern.factorymethod.bean;

/**
 * Description:
 * date: 2021/8/30 11:57
 * Package: com.learn.leetcode.designpattern.factorymethod.bean
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class CouponResult {
    private String code; // 编码
    private String info; // 描述

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
