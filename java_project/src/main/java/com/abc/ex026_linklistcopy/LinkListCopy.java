package com.abc.ex026_linklistcopy;

import com.abc.data.ComplexListNode;

/**
 * Created by U-Demon
 * Date: 2020/6/22
 */
public class LinkListCopy {

    public static ComplexListNode clone(ComplexListNode head) {
        if (head == null)
            return null;

        cloneNodes(head);
        connectSiblingNodes(head);
        return reconnectNodes(head);
    }

    /**
     * 复制节点
     * @param head
     */
    private static void cloneNodes(ComplexListNode head) {
        ComplexListNode node = head;
        while (node != null) {
            ComplexListNode clone = new ComplexListNode(node.value);
            clone.next = node.next;
            node.next = clone;
            node = clone.next;
        }
    }

    /**
     * 连接随机节点
     * @param head
     */
    private static void connectSiblingNodes(ComplexListNode head) {
        ComplexListNode node = head;
        while (node != null) {
            if (node.sibling != null) {
                node.next.sibling = node.sibling.next;
            }
            node = node.next.next;
        }
    }

    /**
     * 拆分两个链表
     * @param head
     * @return
     */
    private static ComplexListNode reconnectNodes(ComplexListNode head) {
        ComplexListNode cloneHead = head.next;
        ComplexListNode node = head;
        ComplexListNode cloneNode = null;

        while (node != null) {
            cloneNode = node.next;
            node.next = cloneNode.next;
            if (node.next != null) {
                cloneNode.next = node.next.next;
            }
            node = node.next;
        }
        return cloneHead;
    }

}
