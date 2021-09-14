package com.learn.leetcode.designpattern.chain;

/**
 * Description:
 * date: 2021/9/14 13:59
 * Package: com.learn.leetcode.designpattern.chain
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public abstract class Handler<T> {

    /**
     * TODO 责任链模式
     * 责任链将链表中的每一个节点都看做是一个对象，每个节点处理的职责不同，且内部自动维护了下一个节点对象，当请求
     * 从链式的首端出发时，会沿着责任链预设的路径依次传递到每一个节点，属于行为型设计模式
     * <p>
     * 责任链将请求与处理解耦，请求处理者（节点对象）只需关注自己感兴趣的请求进行处理即可，对于不感兴趣的处理
     * 交给下一个节点来处理，具备链式传递处理请求功能，链式结构比较灵活，可以通过改变链式结构来改变业务逻辑
     * <p>
     * 缺点是责任链过长的话性能较低
     * 注意节点对象的循环引用问题
     */

    protected Handler chain;

    public void next(Handler handler) {
        this.chain = handler;
    }

    public abstract void doHandle(Member member);

    public static class Builder<T> {

        private Handler<T> head;

        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build() {
            return this.head;
        }
    }
}

