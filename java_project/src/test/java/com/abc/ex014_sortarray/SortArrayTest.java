package com.abc.ex014_sortarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class SortArrayTest {

    int[] arr = null;

    @BeforeEach
    void setUp() {
        arr = new int[]{1,2,3,4,5,6,7,8,9};
    }

    @Test
    void test_1() {
        SortArray.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
