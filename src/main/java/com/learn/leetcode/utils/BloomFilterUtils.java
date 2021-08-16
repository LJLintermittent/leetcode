package com.learn.leetcode.utils;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * Description:
 * date: 2021/8/16 16:59
 * Package: com.learn.leetcode.utils
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class BloomFilterUtils {

    private static int size = 1000000;

    private static double fpp = 0.01;

    /**
     * guava实现的以CAS方式设置每个bit位的值
     * private final LockFreeBitArray bits;
     * 哈希函数的个数
     * private final int numHashFunctions;
     * 将对象转换为byte的通道
     * private final Funnel<? super T> funnel;
     * <p>
     * 在BloomFilterStrategies中有一个内部类LockFreeBitArray
     * 同时在BloomFilterStrategies是一个枚举类，它以枚举的方式提供它实现的接口的两个抽象方法的实现
     * 这也是effective java作者推荐的提供对象的方式（单例）
     * 它的set方法使用了:
     * AtomicLongArray.compareAndSet
     * while (!data.compareAndSet(longIndex, oldValue, newValue));
     * CAS无锁化方式实现bit数组的设置。
     */
    private static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), size, fpp);

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            bloomFilter.put(i);
        }

        int count = 0;
        for (int i = 1000000; i < 2000000; i++) {
            if (bloomFilter.mightContain(i)) {
                count++;
                System.out.println(i + "误判了");
            }
        }
        // 误判率接近0.01
        System.out.println("总误判数：" + count);
    }


}
