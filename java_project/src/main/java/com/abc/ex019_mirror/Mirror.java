package com.abc.ex019_mirror;

import com.abc.data.BinaryTreeNode;

import java.util.Stack;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class Mirror {

    public static void mirrorRec(BinaryTreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return;

        BinaryTreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        mirrorRec(root.left);
        mirrorRec(root.right);
    }

    public static void mirror(BinaryTreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return;

        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        BinaryTreeNode temp = null;
        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();
            if (node.left != null || node.right != null) {
                temp = root.left;
                root.left = root.right;
                root.right = node;
            }
            if (node.left != null)
                stack.push(node.left);
            if (node.right != null)
                stack.push(node.right);
        }
    }

}
