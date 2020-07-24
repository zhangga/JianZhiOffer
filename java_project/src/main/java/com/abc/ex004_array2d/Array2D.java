package com.abc.ex004_array2d;

/**
 * Created by U-Demon
 * Date: 2020/6/8
 */
public class Array2D {

    /**
     * 左上角开始找
     * @param array
     * @param num
     * @return
     */
    public static boolean contains_1(int[][] array, int num) {
        if (array == null || array.length == 0)
            return false;

        for (int col = 0; col < array[0].length; col++) {
            int row = 0;
            while (row < array.length) {
                if (array[row][col] < num)
                    row++;
                else if (array[row][col] == num)
                    return true;
                else
                    break;
            }
        }
        return false;
    }

    /**
     * 右上角开始找
     * @param array
     * @param num
     * @return
     */
    public static boolean contains_2(int[][] array, int num) {
        if (array == null || array.length == 0)
            return false;

        int row = 0, col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            if (array[row][col] < num)
                row++;
            else if (array[row][col] == num)
                return true;
            else
                col--;
        }
        return false;
    }

    /**
     * 二分法，时间O(logmn)，空间O(1)
     * 需要先排序数组，这个解法不对
     * @param array
     * @param num
     * @return
     */
    public static boolean contains_3(int[][] array, int num) {
        if (array == null || array.length == 0)
            return false;

        //TODO 需要先排序数组

        int left = 0;
        int col = array[0].length;
        int right = array.length * col - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int value = array[mid / col][mid % col];
            if (value == num)
                return true;
            else if (value < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

}
