package com.abc.ex027_bstconvert;

import com.abc.data.BinaryTreeNode;

/**
 * Created by U-Demon
 * Date: 2020/6/28
 */
public class BSTConvert {

    public static BinaryTreeNode convert(BinaryTreeNode root) {
        if (root == null)
            return null;

        // 转换双向列表
        BinaryTreeNode tail = convertNode(root);
        // 返回头结点
        BinaryTreeNode head = tail;
        while (head.left != null) {
            head = head.left;
        }
        return head;
    }

    private static BinaryTreeNode convertNode(BinaryTreeNode node) {
        if (node.left == null)
            return node;
        BinaryTreeNode nodeLeft = convertNode(node.left);
        node.left = nodeLeft;
        nodeLeft.right = node;
        if (node.right == null)
            return node;
        BinaryTreeNode nodeRight = convertNode(node.right);
        node.right = nodeRight;
        nodeRight.left = node;
        return nodeRight;
    }

}
