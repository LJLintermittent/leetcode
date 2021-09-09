package com.learn.leetcode.designpattern.builder;

/**
 * Description:
 * date: 2021/9/9 17:40
 * Package: com.learn.leetcode.designpattern.builder
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class UserBuilder {

    private User user = new User();

    public UserBuilder addName(String name) {
        user.setName(name);
        return this;
    }

    public UserBuilder addAdderss(String address) {
        user.setAddress(address);
        return this;
    }

    public UserBuilder addPhoneNumer(String phoneNumebr) {
        user.setPhoneNumber(phoneNumebr);
        return this;
    }

    public UserBuilder addAge(int age) {
        user.setAge(age);
        return this;
    }

    public User build() {
        return user;
    }

}
