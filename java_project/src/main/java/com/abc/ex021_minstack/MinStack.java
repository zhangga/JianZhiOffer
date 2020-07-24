package com.abc.ex021_minstack;

/**
 * 最小栈，方法时间复杂度O(1)
 * Created by U-Demon
 * Date: 2020/6/19
 */
public class MinStack {

    private int[] stack;
    private int[] min;
    private int top;

    public MinStack() {
        stack = new int[10];
        min = new int[10];
        top = -1;
    }

    public void push(int n) {
        if (top >= stack.length - 1)
            return;
        stack[++top] = n;
        if (top == 0) {
            min[top] = n;
        }
        else {
            min[top] = Math.min(n, min[top-1]);
        }
    }

    public int pop() {
        if (top < 0)
            return -1;
        return stack[top--];
    }

    public int min() {
        if (top < 0)
            return -1;
        return min[top];
    }

}
