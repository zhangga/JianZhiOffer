package com.abc.ex017_mergelist;

import com.abc.data.ListNode;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class MergeList {

    public static ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        ListNode head = null, node = new ListNode(0);
        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                node.next = head1;
                head1 = head1.next;
            }
            else {
                node.next = head2;
                head2 = head2.next;
            }
            node = node.next;
            if (head == null) {
                head = node;
            }
        }
        if (head1 == null) {
            node.next = head2;
        }
        else if (head2 == null) {
            node.next = head1;
        }
        return head;
    }

}
