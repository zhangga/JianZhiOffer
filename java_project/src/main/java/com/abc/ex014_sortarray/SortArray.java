package com.abc.ex014_sortarray;

/**
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class SortArray {

    public static void sort(int[] array) {
        if (array == null)
            return;
        int l = 0, r = array.length - 1;
        while (l < r) {
            while (l < r && (array[l] & 1) != 0)
                l++;
            while (l < r && (array[r] & 1) == 0)
                r--;
            if (l < r) {
                int temp = array[r];
                array[r] = array[l];
                array[l] = temp;
                l++;
                r--;
            }
        }
    }

}
