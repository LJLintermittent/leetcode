package com.learn.leetcode.twohundredTothreehundred;

/**
 * Description:
 * date: 2021/8/11 11:50
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC208 {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        boolean ans1 = trie.search("apple");
        boolean ans2 = trie.search("app");
        trie.insert("app");
        boolean ans3 = trie.search("app");

        boolean ans4 = trie.startsWith("applelee");

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);

    }

    /**
     * 实现 Trie (前缀树)
     */
    static class Trie {

        private Trie[] children;

        private boolean isEnd;

        public Trie() {
            children = new Trie[26];
            isEnd = false;
        }

        public void insert(String word) {
            // this是已经new好的当前Trie对象，如果是刚初始化后就调用insert方法，
            // 那么这个children成员变量应该是一个大小为26的空数组
            Trie node = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';
                if (node.children[index] == null) {
                    //构造多叉树
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            Trie node = searchPrefix(word);
            return node != null && node.isEnd;
        }

        private Trie searchPrefix(String prefix) {
            Trie node = this;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                int index = c - 'a';
                if (node.children[index] == null) {
                    return null;
                }
                node = node.children[index];
            }
            return node;
        }

        public boolean startsWith(String prefix) {
            return searchPrefix(prefix) != null;
        }

    }
}
