package com.abc.ex008_rotatemin;

import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/12
 */
public class RotateMinTest {
    int[] arr1 = {3, 4, 5, 1, 2};
    int[] arr2 = {1, 2, 3, 4, 5};
    int[] arr3 = {2, 1, 2, 2, 2};

    @Test
    void test_1() {
        assert 1 == RotateMin.min_n(arr1);
        assert 1 == RotateMin.min_n(arr2);
        assert 1 == RotateMin.min_n(arr3);
    }

    @Test
    void test_2() {
        assert 1 == RotateMin.min_logn(arr1);
        assert 1 == RotateMin.min_logn(arr2);
        assert 1 == RotateMin.min_logn(arr3);
    }
}
