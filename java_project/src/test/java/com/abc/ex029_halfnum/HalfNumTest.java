package com.abc.ex029_halfnum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/8/10
 */
public class HalfNumTest {

    private int[] nums = null;

    @BeforeEach
    void setUp() {
        nums = new int[]{2, 1, 2, 3, 4, 2, 1, 2, 2};
    }

    @Test
    void test() {
        HalfNum halfNum = new HalfNum();
        assert 2 == halfNum.find(nums);
    }

}
