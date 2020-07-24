package com.abc.ex009_frog;

import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class FrogStepTest {

    @Test
    void test_1() {
        assert 1024 == FrogStep.step_rec(11);
    }

    @Test
    void test_2() {
        assert 1024 == FrogStep.step(11);
    }

}
