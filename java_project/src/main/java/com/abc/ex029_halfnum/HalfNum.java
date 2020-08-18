package com.abc.ex029_halfnum;

/**
 * Created by U-Demon
 * Date: 2020/8/10
 */
public class HalfNum {

    public int find1(int[] nums) {
        if (nums == null)
            return -1;
        int times = 0;
        int num = -1;
        for (int i = 0; i < nums.length; i++) {
            if (times == 0) {
                times++;
                num = nums[i];
                continue;
            }
            if (nums[i] == num) {
                times++;
            }
            else {
                times--;
            }
        }
        return num;
    }

    public int find(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int middle = nums.length / 2;
        int start = 0, end = nums.length - 1;
        int index = -1;
        while (index != middle) {
            if (index < middle) {
                index = partition(nums, index + 1, end);
            }
            else {
                index = partition(nums, start, index - 1);
            }
        }
        return nums[middle];
    }

    private int partition(int[] nums, int start, int end) {
        int pivot = nums[(start + end) / 2];
        int left = start - 1;
        int right = end + 1;
        while (true) {
            while (nums[++left] < pivot && left < end);
            while (nums[--right] > pivot && right > start);
            if (left >= right)
                break;
            int tmp = nums[right];
            nums[right] = nums[left];
            nums[left] = tmp;
        }
        return left;
    }

}
