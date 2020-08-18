package com.abc.ex030_topk;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * TopK问题：
 * 1.划分
 * 2.最大堆
 * Created by U-Demon
 * Date: 2020/8/10
 */
public class TopK {

    public int[] topK(int[] nums, int k) {
        // 最大堆
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num : nums) {
            if (queue.size() < k) {
                queue.offer(num);
            }
            else if (num < queue.peek()) {
                queue.poll();
                queue.offer(num);
            }
        }
        int[] res = new int[queue.size()];
        int index = 0;
        for (int num : queue) {
            res[index++] = num;
        }
        return res;
    }

}
