package com.abc.ex018_subtree;

import com.abc.data.BinaryTreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class SubTreeTest {
    private BinaryTreeNode root;
    private BinaryTreeNode child;

    @BeforeEach
    void setUp() {
        root = new BinaryTreeNode(8);
        BinaryTreeNode n1 = root.addLeft(8);
        root.addRight(7);
        n1.addLeft(9);
        BinaryTreeNode n2 = n1.addRight(2);
        n2.addLeft(4);
        n2.addRight(7);

        child = new BinaryTreeNode(8);
        child.addLeft(9);
        child.addRight(2);
    }

    @Test
    void test_1() {
        assert true == SubTree.hasSubTree(root, child);
    }
}
