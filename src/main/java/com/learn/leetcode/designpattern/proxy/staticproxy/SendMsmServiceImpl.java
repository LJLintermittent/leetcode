package com.learn.leetcode.designpattern.proxy.staticproxy;

/**
 * Description:
 * date: 2021/8/26 23:32
 * Package: com.duanxu.proxy.staticproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class SendMsmServiceImpl implements SendMsmService {

    @Override
    public void send(String content) {
        System.out.println("成功发送了一条短信，内容是：" + content);
    }

}
