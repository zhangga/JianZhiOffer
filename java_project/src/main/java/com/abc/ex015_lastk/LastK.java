package com.abc.ex015_lastk;

import com.abc.data.ListNode;

/**
 * 当我们用一个指针遍历链表不能解决问题的时候，可以尝试用两个指针来遍历链表。
 * 可以让其中一个指针遍历的速度快一些（比如一次在链表上走两步），或者让它先在链表上走若干步。
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class LastK {

    public static ListNode find(ListNode head, int k) {
        if (head == null || k <= 0)
            return null;

        ListNode first = head, second = head;
        int i = 0;
        while (first != null) {
            first = first.next;
            i++;
            if (i > k) {
                second = second.next;
            }
        }
        if (i < k) {
            return find(head, k%i);
        }
        else {
            return second;
        }
    }

}
