package com.abc.ex021_minstack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/19
 */
public class MinStackTest {

    private MinStack stack;

    @BeforeEach
    void setUp() {
        stack = new MinStack();
        stack.push(3);
        stack.push(5);
        stack.push(1);
    }

    @Test
    void test_1() {
        assert 1 == stack.min();
        stack.pop();
        assert 3 == stack.min();
        assert 3 == stack.min();
    }
}
