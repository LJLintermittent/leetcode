package com.learn.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/8/21 14:07
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer33 {

    public static void main(String[] args) {
        int[] postorder = {1, 6, 3, 2, 5};
        int[] postorder1 = {1,3,2,6,5};
        boolean ans = verifyPostorder(postorder1);

        System.out.println(ans);
    }

    /**
     * 剑指 Offer 33. 二叉搜索树的后序遍历序列
     * 单调栈
     */
    public static boolean verifyPostorder(int[] postorder) {
        Deque<Integer> stack = new LinkedList<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root) {
                return false;
            }
            while (!stack.isEmpty() && stack.peek() > postorder[i]) {
                //数组元素小于单调栈元素了，表示往左子树走了，记录下上一个根节点
                root = stack.pop();
            }
            stack.push(postorder[i]);
        }
        return true;
    }
}
