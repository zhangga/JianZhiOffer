package com.abc.data;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by U-Demon
 * Date: 2020/6/11
 */
public class QuickSortTest {

    int[] arr = null;

    @BeforeEach
    void setUp() {
        arr = new int[]{4, 7, 2, 3, 10, 8, 1, 5, 9, 6};
    }

    @Test
    void test_1() {
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
