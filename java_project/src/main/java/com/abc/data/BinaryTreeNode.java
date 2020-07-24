package com.abc.data;

import java.util.*;

/**
 * 二叉树的节点
 * Created by U-Demon
 * Date: 2020/6/10
 */
public class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public BinaryTreeNode addLeft(int value) {
        BinaryTreeNode left = new BinaryTreeNode(value);
        this.left = left;
        return left;
    }

    public BinaryTreeNode addRight(int value) {
        BinaryTreeNode right = new BinaryTreeNode(value);
        this.right = right;
        return right;
    }

    public int[] getPreOrder() {
        List<Integer> list = new LinkedList<>();
        getPreData(this, list);
        int[] array = list.stream().mapToInt(Integer::valueOf).toArray();
        return array;
    }

    private void getPreData(BinaryTreeNode node, List<Integer> list) {
        if (node != null) {
            list.add(node.value);
            getPreData(node.left, list);
            getPreData(node.right, list);
        }
    }

    public void printPreOrder() {
        System.out.println(Arrays.toString(getPreOrder()));
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BinaryTreeNode that = (BinaryTreeNode) o;
        return Arrays.equals(this.getPreOrder(), that.getPreOrder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, left, right);
    }
}
