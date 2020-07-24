package com.abc.ex024_sequencebst;

/**
 * Created by U-Demon
 * Date: 2020/6/22
 */
public class SequenceOfBST {

    public static boolean verify(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;

        return verify(sequence, 0, sequence.length-1);
    }

    private static boolean verify(int[] sequence, int start, int end) {
        if (start >= end)
            return true;

        int root = sequence[end];
        int middle = start;
        while (sequence[middle] < root && middle < end) {
            middle++;
        }
        int i = middle;
        while (i <= end-1) {
            if (sequence[i] < root)
                return false;
            i++;
        }

        boolean v = verify(sequence, start, middle-1);
        if (v) {
            v = verify(sequence, middle, end-1);
        }
        return v;
    }

}
