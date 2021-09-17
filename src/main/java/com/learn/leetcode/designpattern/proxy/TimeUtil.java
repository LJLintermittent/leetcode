package com.learn.leetcode.designpattern.proxy;

/**
 * Description:
 * date: 2021/9/17 22:55
 * Package: com.learn.leetcode.designpattern.proxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TimeUtil {

    private static final ThreadLocal<Long> TIME_THREAD_LOCAL = new ThreadLocal<Long>() {
        @Override
        protected Long initialValue() {
            return System.currentTimeMillis();
        }
    };

    public static final void begin() {
        TIME_THREAD_LOCAL.set(System.currentTimeMillis());
    }

    public static final Long consum() {
        return System.currentTimeMillis() - TIME_THREAD_LOCAL.get();
    }
}
