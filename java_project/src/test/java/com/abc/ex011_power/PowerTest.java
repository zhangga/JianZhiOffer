package com.abc.ex011_power;

import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class PowerTest {

    @Test
    void test_1() {
        assert 1024 == Power.doPower(2, 10);
        assert 0.04 == Power.doPower(5, -2);
        assert 1 == Power.doPower(5, 0);
        assert 0 == Power.doPower(0, -2);
    }
}
