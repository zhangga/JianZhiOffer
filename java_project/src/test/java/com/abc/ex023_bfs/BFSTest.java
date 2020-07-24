package com.abc.ex023_bfs;

import com.abc.data.BinaryTreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by U-Demon
 * Date: 2020/6/22
 */
public class BFSTest {
    BinaryTreeNode root = null;

    int[] bfs = null;

    @BeforeEach
    void setUp() {
        root = new BinaryTreeNode(1);
        BinaryTreeNode node2 = root.addLeft(2);
        BinaryTreeNode node3 = root.addRight(3);
        BinaryTreeNode node4 = node2.addLeft(4);
        node2.addRight(5);
        node3.addLeft(6);
        node3.addRight(7);
        node4.addLeft(8);
        node4.addRight(9);

        bfs = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    @Test
    void test_1() {
        assert Arrays.equals(bfs, BFS.bfs(root));
    }
}
