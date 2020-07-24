package com.abc.ex018_subtree;

import com.abc.data.BinaryTreeNode;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class SubTree {

    public static boolean hasSubTree(BinaryTreeNode root, BinaryTreeNode child) {
        boolean result = false;
        if (root != null && child != null) {
            if (root.value == child.value) {
                result = isSubTree(root, child);
            }
            if (!result) {
                result = hasSubTree(root.left, child);
            }
            if (!result) {
                result = hasSubTree(root.right, child);
            }
        }
        return result;
    }

    private static boolean isSubTree(BinaryTreeNode root, BinaryTreeNode child) {
        if (child == null)
            return true;
        if (root == null)
            return false;
        if (root.value != child.value)
            return false;

        return isSubTree(root.left, child.left) && isSubTree(root.right, child.right);
    }

}
