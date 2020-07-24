package com.abc.ex004_array2d;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/8
 */
public class Array2DTest {

    int[][] array = new int[][] {
            {1, 2, 8, 9},
            {2, 4, 9, 12},
            {4, 7, 10, 13},
            {6, 8, 11, 15},
    };

    @BeforeAll
    static void beforeAll() {

    }

    @Test
    void test_1() {
        assert true == Array2D.contains_1(array, 7);
        assert false == Array2D.contains_1(array, 5);
    }

    @Test
    void test_2() {
        assert true == Array2D.contains_2(array, 7);
        assert false == Array2D.contains_2(array, 5);
    }

    @Test
    void test_3() {
        assert true == Array2D.contains_3(array, 7);
        assert false == Array2D.contains_3(array, 5);
    }
}
