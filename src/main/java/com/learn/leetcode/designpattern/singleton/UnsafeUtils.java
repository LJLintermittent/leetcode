package com.learn.leetcode.designpattern.singleton;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Description:
 * date: 2021/8/1 12:48
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class UnsafeUtils {

    public static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Unsafe unsafe = UnsafeUtils.getUnsafe();
        System.out.println(unsafe);
    }

}
