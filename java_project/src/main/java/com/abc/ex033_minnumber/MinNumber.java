package com.abc.ex033_minnumber;

import java.util.Arrays;

/**
 * Created by U-Demon
 * Date: 2020/8/14
 */
public class MinNumber {

    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs, 0, strs.length - 1);
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }

    private void quickSort(String[] strs, int left, int right) {
        if (left >= right)
            return;
        String value = strs[left];
        int l = left, r = right;
        String tmp = strs[left];
        while (l < r) {
            while (l < r && (strs[r]+value).compareTo(value+strs[r]) >= 0) r--;
            while (l < r && (strs[l]+value).compareTo(value+strs[l]) <= 0) l++;
            tmp = strs[l];
            strs[l] = strs[r];
            strs[r] = tmp;
        }
        strs[l] = strs[left];
        strs[left] = tmp;
        quickSort(strs, left, l-1);
        quickSort(strs, l+1, right);
    }

}
