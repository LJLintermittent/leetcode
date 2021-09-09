package com.learn.leetcode.designpattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:
 * date: 2021/9/9 15:13
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class SingleTon07 {

    private SingleTon07() {

    }

    //spring源码中的单例Bean简单实现
    private static Map<String, Object> ioc = new ConcurrentHashMap<>(16);

    public static Object getBean(String className) {
        synchronized (SingleTon07.class) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    Object instance = Class.forName(className).newInstance();
                    ioc.put(className, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }

}
