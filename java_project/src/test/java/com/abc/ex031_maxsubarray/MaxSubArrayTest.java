package com.abc.ex031_maxsubarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/8/14
 */
public class MaxSubArrayTest {

    int[] nums = null;

    @BeforeEach
    void setUp() {
        nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    }

    @Test
    void test() {
        assert 6 == new MaxSubArray().max(nums);
    }

}
