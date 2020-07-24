package com.abc.ex008_rotatemin;

/**
 * 输入一个递增数组的旋转，找出最小元素
 * Created by U-Demon
 * Date: 2020/6/12
 */
public class RotateMin {

    /**
     * 时间复杂度O(n)
     * @param arr
     * @return
     */
    public static int min_n(int[] arr) {
        return minInOrder(arr, 0, arr.length-1);
    }

    /**
     * 二分查找
     * @param arr
     * @return
     */
    public static int min_logn(int[] arr) {
        int left = 0, right = arr.length - 1;
        if (arr[left] < arr[right])
            return arr[left];

        while (left < right) {
            int mid = (left + right) >>> 1;
            if (arr[left] == arr[mid] && arr[mid] == arr[right])
                return minInOrder(arr, left, right);

            if (arr[mid] > arr[left])
                left = mid + 1;
            else
                right = mid;
        }
        return arr[left];
    }

    private static int minInOrder(int[] arr, int left, int right) {
        int min = arr[left];
        while (left < right) {
            if (arr[++left] < min)
                min = arr[left];
        }
        return min;
    }

}
