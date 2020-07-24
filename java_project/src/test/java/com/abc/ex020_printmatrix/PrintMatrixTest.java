package com.abc.ex020_printmatrix;

import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class PrintMatrixTest {

    private int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
    };

    @Test
    void test_1() {
        PrintMatrix.print(matrix);
    }
}
