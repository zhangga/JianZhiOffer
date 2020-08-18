package com.abc.ex028_permutation;

import java.util.*;

/**
 * leetcode46/47
 * Created by U-Demon
 * Date: 2020/7/24
 */
public class Permutation {

    /**
     * 回溯剪枝
     * @param s
     * @return
     */
    public String[] permutation_cut(String s) {
        int len = s.length();
        if (len == 0)
            return new String[0];
        List<String> res = new LinkedList<>();
        char[] path = new char[len];
        boolean[] used = new boolean[len];
        // 排序，为了剪枝
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        dfs(chars, len, 0, path, used, res);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(char[] chars, int len, int depth, char[] path, boolean[] used, List<String> res) {
        if (depth == len) {
            res.add(String.valueOf(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i])
                continue;
            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !used[i - 1] 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
                continue;
            }

            path[depth] = chars[i];
            used[i] = true;
            dfs(chars, len, depth + 1, path, used, res);
            used[i] = false;
//            path[depth] = ' ';
        }
    }

    /**
     * 回溯算法。交换
     * @param s
     * @return
     */
    public String[] permutation_swap(String s) {
        int len = s.length();
        if (len == 0)
            return new String[0];
        List<String> res = new LinkedList<>();
        dfs(s.toCharArray(), len, 0, res);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(char[] chars, int len, int depth, List<String> res) {
        if (depth == len - 1) {
            res.add(String.valueOf(chars));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = depth; i < len; i++) {
            // 重复剪枝
            if (set.contains(chars[i]))
                continue;
            set.add(chars[i]);
            swap(chars, i, depth);
            dfs(chars, len, depth + 1, res);
            swap(chars, i, depth);
        }
    }

    private void swap(char[] chars, int a, int b) {
        char tmp = chars[b];
        chars[b] = chars[a];
        chars[a] = tmp;
    }

    /**
     * 回溯算法。状态。不重复的数字
     * @param nums
     * @return
     */
    public List<List<Integer>> permutation_state(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0)
            return res;

        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private void dfs(int[] nums, int len, int depth,
                     List<Integer> path, boolean[] used,
                     List<List<Integer>> res) {
        if (depth == len) {
            res.add(path);
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1, path, used, res);
                // 注意：这里是状态重置，是从深层结点回到浅层结点的过程，代码在形式上和递归之前是对称的
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

}
