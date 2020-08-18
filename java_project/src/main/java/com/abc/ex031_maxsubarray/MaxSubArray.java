package com.abc.ex031_maxsubarray;

/**
 * Created by U-Demon
 * Date: 2020/8/14
 */
public class MaxSubArray {

    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int max(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max = nums[0];
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            last = Math.max(last+nums[i], nums[i]);
            max = Math.max(max, last);
        }
        return max;
    }

}
