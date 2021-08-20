package com.learn.leetcode.twohundredTothreehundred;

import com.learn.leetcode.utils.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * date: 2021/8/20 10:32
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC297 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        String serialize = serialize(root);
        System.out.println(serialize);

    }

    /**
     * 二叉树的序列化与反序列化
     */
    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        StringBuilder newsb = ser(root, sb);
        return newsb.toString();

    }

    private static StringBuilder ser(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return sb;
        }
        sb.append(root.val);
        sb.append(",");
        sb = ser(root.left, sb);
        sb = ser(root.right, sb);
        return sb;
    }

    public static TreeNode deserialize(String data) {
        String[] str_word = data.split(",");
        List<String> word_list = new LinkedList<>(Arrays.asList(str_word));
        return des(word_list);
    }

    private static TreeNode des(List<String> word_list) {
        if (word_list.get(0).equals("null")) {
            word_list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(word_list.get(0)));
        word_list.remove(0);
        root.left = des(word_list);
        root.right = des(word_list);
        return root;
    }
}
