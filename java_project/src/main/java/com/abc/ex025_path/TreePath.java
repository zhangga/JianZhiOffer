package com.abc.ex025_path;

import com.abc.data.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by U-Demon
 * Date: 2020/6/22
 */
public class TreePath {

    public static List<int[]> find(BinaryTreeNode root, int total) {
        if (root == null)
            return null;

        List<int[]> paths = new ArrayList<>();
        LinkedList<BinaryTreeNode> list = new LinkedList<>();
        findRec(root, 0, total, list, paths);
        return paths;
    }

    private static void findRec(BinaryTreeNode node, int sum, int total, LinkedList<BinaryTreeNode> list, List<int[]> paths) {
        if (sum + node.value == total) {
            list.addLast(node);
            int[] path = list.stream().mapToInt(BinaryTreeNode::getValue).toArray();
            paths.add(path);
            list.removeLast();
        }
        else if (sum + node.value < total) {
            list.addLast(node);
            sum += node.value;
            if (node.left != null) {
                findRec(node.left, sum, total, list, paths);
            }
            if (node.right != null) {
                findRec(node.right, sum, total, list, paths);
            }
            list.removeLast();
        }
    }

}
