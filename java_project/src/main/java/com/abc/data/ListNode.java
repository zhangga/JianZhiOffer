package com.abc.data;

/**
 * 链表的节点
 * Created by U-Demon
 * Date: 2020/6/10
 */
public class ListNode {

    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode addNext(int value) {
        ListNode next = new ListNode(value);
        this.next = next;
        return next;
    }

    public ListNode addPre(int value) {
        ListNode pre = new ListNode(value);
        pre.next = this;
        return pre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        ListNode node = this;
        while (node != null) {
            sb.append(node.value).append(", ");
            node = node.next;
        }
        String str = sb.substring(0, sb.length() - 2);
        return str + "]";
    }
}
