package com.abc.ex007_stack2queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 两个队列实现栈
 * Created by U-Demon
 * Date: 2020/6/10
 */
public class Queue2Stack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public Queue2Stack() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public void push(int item) {
        if (!queue2.isEmpty()) {
            queue2.add(item);
        }
        else {
            queue1.add(item);
        }
    }

    public int pop() {
        if (queue2.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            if (queue1.size() == 1)
                return queue1.remove();
        }
        else if (queue1.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.add(queue2.remove());
            }
            if (queue2.size() == 1)
                return queue2.remove();
        }
        return -1;
    }

}
