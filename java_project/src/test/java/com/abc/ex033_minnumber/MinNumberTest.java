package com.abc.ex033_minnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/8/14
 */
public class MinNumberTest {

    int[] nums = null;

    @BeforeEach
    void setUp() {
        nums = new int[]{3, 32, 321};
    }

    @Test
    void test() {
        assert "321323".equals(new MinNumber().minNumber(nums));
    }

}
