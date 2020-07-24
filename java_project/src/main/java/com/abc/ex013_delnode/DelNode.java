package com.abc.ex013_delnode;

import com.abc.data.ListNode;

/**
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class DelNode {

    public static void del(ListNode head, ListNode del) {
        if (head == null || del == null)
            return;

        // 要删除的节点不是尾节点
        if  (del.next != null) {
            ListNode next = del.next;
            del.value = next.value;
            del.next = next.next;
            next = null;
        }
        // 链表只有一个节点
        else if (head == del) {
            head = null;
        }
        // 删除尾节点
        else {
            ListNode node = head;
            while (node.next != null) {
                if (node.next == del) {
                    node.next = node.next.next;
                }
                node = node.next;
            }
        }
    }

}
