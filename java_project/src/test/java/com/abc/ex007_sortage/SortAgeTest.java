package com.abc.ex007_sortage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by U-Demon
 * Date: 2020/6/12
 */
public class SortAgeTest {

    int[] ages = null;

    @BeforeEach
    void setUp() {
        ages = new int[]{3, 10, 30, 10, 12, 40, 12};
    }

    @Test
    void test_1() {
        SortAge.sort(ages);
        System.out.println(Arrays.toString(ages));
    }
}
