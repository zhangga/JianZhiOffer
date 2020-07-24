package com.abc.ex016_reverselist;

import com.abc.data.ListNode;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class ReverseList {

    /**
     * 递归实现
     * @param head
     * @return
     */
    public static ListNode reverse1(ListNode head) {
        if (head == null)
            return null;
        return reverse_rec(null, head);
    }

    private static ListNode reverse_rec(ListNode pre, ListNode node) {
        ListNode next = node.next;
        node.next = pre;
        if (next == null)
            return node;
        return reverse_rec(node, next);
    }

    /**
     * 三指针实现
     * @param head
     * @return
     */
    public static ListNode reverse2(ListNode head) {
        ListNode pre = null, node = head, next = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

}
