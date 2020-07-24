package com.abc.ex007_stack2queue;

import java.util.Stack;

/**
 * 两个栈实现队列
 * Created by U-Demon
 * Date: 2020/6/10
 */
public class Stack2Queue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Stack2Queue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void add(int item) {
        stack1.push(item);
    }

    public int remove() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.empty() ? -1 : stack2.pop();
    }

}
