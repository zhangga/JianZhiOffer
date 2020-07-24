package com.abc.ex003_duplicate;

import java.util.Arrays;

/**
 * Created by U-Demon
 * Date: 2020/6/8
 */
public class DuplicateNum {

    /**
     * 排序,时间O(nlogn),空间O(1)
     * @param nums
     * @return
     */
    public static int find_1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1])
                return nums[i];
        }
        return -1;
    }

    /**
     * hash,时间O(n),空间O(n)
     * @param nums
     * @return
     */
    public static int find_2(int[] nums) {
        int[] hash = new int[nums.length];
        Arrays.fill(hash, -1);
        for (int n : nums) {
            if (hash[n] == -1)
                hash[n] = n;
            else
                return n;
        }
        return -1;
    }

    /**
     * 重排数组,时间O(n),空间O(1)
     * @param nums
     * @return
     */
    public static int find_3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                int n = nums[i];
                if (n < i)
                    return nums[n];
                nums[i] = nums[n];
                nums[n] = n;
            }
        }
        return -1;
    }

    /**
     * 不改变原数组,空间O(1),时间O(nlogn)
     * @param nums
     * @return
     */
    public static int find_4(int[] nums) {
        if (nums == null)
            return -1;

        int start = 0, end = nums.length-2;
        while (start <= end) {
            int middle = (end-start)/2+start;
            int count = getCount(nums, start, middle);
            if (middle == start && count > 1) {
                return start;
            }

            if (count > middle-start+1)
                end = middle;
            else
                start = middle + 1;
        }
        return -1;
    }

    private static int getCount(int[] nums, int min, int max) {
        if (nums == null)
            return 0;
        int count = 0;
        for (int n : nums) {
            if (n >= min && n <= max)
                count++;
        }
        return count;
    }

}
