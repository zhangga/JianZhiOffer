package com.abc.ex005_mergelist;

/**
 * Created by U-Demon
 * Date: 2020/6/9
 */
public class MergeList {

    public static void merge(int[] list1, int[] list2, int list1_size) {
        int index1 = list1_size - 1;
        int index2 = list2.length - 1;
        int i = index1 + index2 + 1;
        while (index1 >= 0 && index2 >= 0) {
            if (list1[index1] > list2[index2]) {
                list1[i--] = list1[index1--];
            }
            else {
                list1[i--] = list2[index2--];
            }
        }
        while (index1 >= 0) {
            list1[i--] = list1[index1--];
        }
        while (index2 >= 0) {
            list1[i--] = list2[index2--];
        }
    }

}
