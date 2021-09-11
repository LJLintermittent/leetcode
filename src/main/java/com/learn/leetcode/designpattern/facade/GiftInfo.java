package com.learn.leetcode.designpattern.facade;

/**
 * Description:
 * date: 2021/9/11 17:53
 * Package: com.learn.leetcode.designpattern.facade
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class GiftInfo {

    private String name;

    public GiftInfo(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
