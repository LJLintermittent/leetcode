package com.learn.leetcode.designpattern.chain;

/**
 * Description:
 * date: 2021/9/14 14:11
 * Package: com.learn.leetcode.designpattern.chain
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class MemberService {

    public void login(String loginName, String loginPass) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandle(new Member(loginName, loginPass));
    }
}
