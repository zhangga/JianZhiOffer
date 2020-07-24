package com.abc.ex025_path;

import com.abc.data.BinaryTreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by U-Demon
 * Date: 2020/6/22
 */
public class TreePathTest {

    BinaryTreeNode root = null;

    @BeforeEach
    void setUp() {
        root = new BinaryTreeNode(10);
        BinaryTreeNode node5 = root.addLeft(5);
        root.addRight(12);
        node5.addLeft(4);
        node5.addRight(7);
    }

    @Test
    void test_1() {
        List<int[]> paths = TreePath.find(root, 22);
        paths.forEach(v -> {
            System.out.println(Arrays.toString(v));
        });
    }
}
