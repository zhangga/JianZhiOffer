package com.abc.ex010_num1;

import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class NumOfOneTest {

    @Test
    void test_1() {
        assert 2 == NumOfOne.num(9);
    }

    @Test
    void test_2() {
        assert 2 == NumOfOne.num1(9);
    }
}
