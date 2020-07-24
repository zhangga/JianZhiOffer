package com.abc.data;

import java.util.Arrays;

/**
 * 快速排序
 * Created by U-Demon
 * Date: 2020/6/11
 */
public class QuickSort {

    public static void sort(int[] arr) {
        recSort(arr, 0, arr.length - 1);
    }

    private static void recSort(int[] arr, int left, int right) {
        // 小范围排序。插入排序
        int size = right - left + 1;
//        if (size < 10) {
//            insertSort(arr, left, right);
//            return;
//        }
        if (size <= 1)
            return;

        int pivot = middleOf3(arr, left, right);
        int partition = partition(arr, left, right, pivot);
        recSort(arr, left, partition-1);
        recSort(arr, partition+1, right);
    }

    /**
     * 划分
     * @param arr
     * @param left
     * @param right
     */
    private static int partition(int[] arr, int left, int right, int pivot) {
        int leftPtr = left;
        int rightPtr = right - 1;
        while (true) {
            while (arr[++leftPtr] < pivot)
                ;
            while (arr[--rightPtr] > pivot)
                ;
            if (leftPtr >= rightPtr)
                break;
            else
                swap(arr, leftPtr, rightPtr);
        }
        swap(arr, leftPtr, right-1);
        return leftPtr;
    }

    /**
     * 三值取中
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private static int middleOf3(int[] arr, int left, int right) {
        int middle = (left + right) / 2;
        // left middle
        if (arr[middle] < arr[left])
            swap(arr, left, middle);
        if (arr[right] < arr[middle]) {
            swap(arr, right, middle);
            if (arr[middle] < arr[left]) {
                swap(arr, left, middle);
            }
        }

        // 把中值放到最后面
        swap(arr, middle, right-1);
        return arr[right-1];
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    private static void insertSort(int[] arr, int left, int right) {
        int i = left + 1;
        while (i <= right) {
            int value = arr[i];
            if (arr[i] < arr[i-1]) {

            }
        }
    }

}
