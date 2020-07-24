package com.abc.ex023_bfs;

import com.abc.data.BinaryTreeNode;

import java.util.*;

/**
 * Created by U-Demon
 * Date: 2020/6/22
 */
public class BFS {

    public static int[] bfs(BinaryTreeNode root) {
        if (root == null)
            return null;

        List<Integer> bfs = new ArrayList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            bfs.add(node.value);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return bfs.stream().mapToInt(Integer::intValue).toArray();
    }

}
