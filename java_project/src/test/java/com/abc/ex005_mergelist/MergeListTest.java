package com.abc.ex005_mergelist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by U-Demon
 * Date: 2020/6/9
 */
public class MergeListTest {

    int[] list1 = null;
    int[] list2 = null;
    int[] list3 = new int[]{1, 2, 3, 4, 5, 6, 7};
    int list1_size = 0;

    @BeforeEach
    void setUp() {
        list1 = new int[]{1, 2, 3, 0, 0, 0, 0};
        list2 = new int[]{4, 5, 6, 7};
        list1_size = 3;
    }

    @Test
    void test_1() {
        MergeList.merge(list1, list2, list1_size);
        assert Arrays.equals(list1, list3);
    }
}
