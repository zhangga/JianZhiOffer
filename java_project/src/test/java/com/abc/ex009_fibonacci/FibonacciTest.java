package com.abc.ex009_fibonacci;

import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/12
 */
public class FibonacciTest {

    @Test
    void test_1() {
        assert 55 == Fibonacci.fib_rec(10);
        assert 55 == Fibonacci.fib(10);
    }

}
