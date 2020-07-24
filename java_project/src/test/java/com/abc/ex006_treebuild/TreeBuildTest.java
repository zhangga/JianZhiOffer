package com.abc.ex006_treebuild;

import com.abc.data.BinaryTreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/10
 */
public class TreeBuildTest {

    // 前序
    int[] DLR = {1, 2, 4, 7, 3, 5, 6, 8};
    // 中序
    int[] LDR = {4, 7, 2, 1, 5, 3, 8, 6};
    // 二叉树
    BinaryTreeNode root = null;

    @BeforeEach
    void setUp() {
        root = new BinaryTreeNode(1);
        root.addLeft(2).addLeft(4).addRight(7);
        BinaryTreeNode node3 = root.addRight(3);
        node3.addLeft(5);
        node3.addRight(6).addLeft(8);
    }

    @Test
    void test_1() {
        root.printPreOrder();
        BinaryTreeNode head = TreeBuild.build(DLR, LDR);
        if (head != null)
            head.printPreOrder();
        assert root.equals(head);
    }
}
