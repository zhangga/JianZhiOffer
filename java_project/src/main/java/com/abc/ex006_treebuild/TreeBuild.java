package com.abc.ex006_treebuild;

import com.abc.data.BinaryTreeNode;

/**
 * Created by U-Demon
 * Date: 2020/6/10
 */
public class TreeBuild {

    public static BinaryTreeNode build(int[] DLR, int[] LDR) {
        BinaryTreeNode tree = buildTree(DLR, 0, DLR.length - 1, LDR, 0, LDR.length - 1);
        return tree;
    }

    private static BinaryTreeNode buildTree(int[] DLR, int leftPre, int rightPre,
                                            int[] LDR, int leftIn, int rightIn) {
        if (leftPre == rightPre)
            return new BinaryTreeNode(DLR[leftPre]);
        else if (leftPre > rightPre)
            return null;

        int rootValue = DLR[leftPre];
        int index = leftIn;
        while (index <= rightIn) {
            if (LDR[index] == rootValue)
                break;
            index++;
        }
        BinaryTreeNode root = new BinaryTreeNode(rootValue);
        root.left = buildTree(DLR, leftPre+1, leftPre+index-leftIn, LDR, leftIn, index-1);
        root.right = buildTree(DLR, leftPre+index-leftIn+1, rightPre, LDR, index+1, rightIn);
        return root;
    }

}
