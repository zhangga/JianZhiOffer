package com.abc.ex022_stacksequence;

import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/22
 */
public class StackSequenceTest {
    int[] push = {1, 2, 3, 4, 5};
    int[] pop = {4, 5, 3, 2, 1};
    int[] pop2 = {4, 3, 5, 1, 2};

    @Test
    void test_1() {
        assert true == StackSequence.seq(push, pop);
    }

    @Test
    void test_2() {
        assert false == StackSequence.seq(push, pop2);
    }
}
