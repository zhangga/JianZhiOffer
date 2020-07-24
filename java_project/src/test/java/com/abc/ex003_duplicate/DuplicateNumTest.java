package com.abc.ex003_duplicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/8
 */
public class DuplicateNumTest {

    int[] nums = null;
    int expected = 2;

    @BeforeEach
    void setUp() {
        nums = new int[]{2,3,1,0,2,5,3};
    }

    @Test
    void test_1() {
        assert expected == DuplicateNum.find_1(nums);
    }

    @Test
    void test_2() {
        assert expected == DuplicateNum.find_2(nums);
    }

    @Test
    void test_3() {
        assert expected == DuplicateNum.find_3(nums);
    }

    @Test
    void test_4() {
        assert expected == DuplicateNum.find_4(nums);
    }
}
