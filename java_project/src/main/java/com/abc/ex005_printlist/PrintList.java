package com.abc.ex005_printlist;

import com.abc.data.ListNode;

import java.util.Stack;

/**
 * Created by U-Demon
 * Date: 2020/6/10
 */
public class PrintList {

    public static void print(ListNode head) {
        ListNode node = head;
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            stack.push(node.value);
            node = node.next;
        }
        while (!stack.empty()) {
            System.out.print(stack.pop()+", ");
        }
    }

    public static void print_recur(ListNode head) {
        if (head != null) {
            print_recur(head.next);
            System.out.print(head.value+", ");
        }
    }

}
