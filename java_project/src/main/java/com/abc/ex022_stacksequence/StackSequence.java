package com.abc.ex022_stacksequence;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 * Created by U-Demon
 * Date: 2020/6/22
 */
public class StackSequence {

    public static boolean seq(int[] push, int[] pop) {
        if (push == null || pop == null)
            return false;

        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0, popIndex = 0;

        while (true) {
            if (stack.isEmpty() || stack.peek() != pop[popIndex]) {
                if (pushIndex >= push.length) {
                    return false;
                }
                stack.push(push[pushIndex++]);
            }
            else {
                stack.pop();
                popIndex++;
                if (popIndex == pop.length) {
                    return true;
                }
            }
        }
    }

}
