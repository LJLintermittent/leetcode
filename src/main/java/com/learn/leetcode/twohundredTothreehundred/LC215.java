package com.learn.leetcode.twohundredTothreehundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/6/18 22:03
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC215 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int i = findKthLargest(nums, k);
        System.out.println(i);
    }

    /**
     * 数组中的第k个最大元素
     * 构建大根堆，做k-1次删除堆顶操作，这时堆顶元素就是数组排序后的第K大元素
     */
    public static int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums, heapSize);
        for (int i = nums.length - 1; i >= nums.length - k + 1; i--) {
            swap(nums, 0, i);
            heapSize--;
            maxHeapify(nums, 0, heapSize);
        }
        return nums[0];
    }

    public static void buildMaxHeap(int[] heap, int heapSize) {
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeapify(heap, i, heapSize);
        }
    }

    private static void maxHeapify(int[] heap, int i, int heapSize) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int parent = i;
        if (l < heapSize && heap[l] > heap[parent]) {
            parent = l;
        }
        if (r < heapSize && heap[r] > heap[parent]) {
            parent = r;
        }
        if (parent != i) {
            swap(heap, i, parent);
            maxHeapify(heap, parent, heapSize);
        }
    }

    private static void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static int findKthLargest1(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        return nums[length - k];
    }
}
