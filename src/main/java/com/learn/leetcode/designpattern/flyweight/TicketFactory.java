package com.learn.leetcode.designpattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:
 * date: 2021/9/12 17:32
 * Package: com.learn.leetcode.designpattern.flyweight
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TicketFactory {

    /**
     * TODO 享元模式
     * 面向对象可以很好的解决一些灵活性问题和可扩展性问题，但是很多情况下需要在系统中增加类和对象的个数
     * 当对象数量过多时，将导致运行的代价过高，带来性能下降的问题。享元模式就是对象池的一种思想，讲对象内部不变的
     * 状态缓存起来，减少了应用中的数量，将多个对同一对象的访问集中起来，不必为每一个访问者创建一个对象，属于结构性设计模式
     * 享元模式把一个对象的状态分为内部状态和外部状态，内部状态是不变的，外部状态是变化的，然后通过共享不变的部分，达到减少
     * 对象数量而节约内存的目的
     * 关注线程安全，使用享元模式
     * jdk源码使用享元模式:
     * String类
     * 包装数据类型 的缓存
     */

    private static Map<String, ITicket> ticketPool = new ConcurrentHashMap<>(16);

    public synchronized static ITicket queryTicket(String from, String to) {
        String key = from + "->" + to;
        if (ticketPool.containsKey(key)) {
            System.out.println("使用缓存（享元）" + key);
            return TicketFactory.ticketPool.get(key);
        }
        System.out.println("首次查询该区间城市的车票,需要创建对象：" + key);
        TrainTicket trainTicket = new TrainTicket(from, to);
        ticketPool.put(key, trainTicket);
        return trainTicket;
    }
}
