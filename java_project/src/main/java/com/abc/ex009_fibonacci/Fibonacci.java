package com.abc.ex009_fibonacci;

/**
 * 斐波那契数列。
 * 青蛙跳台阶的问题和这个一样。
 * 用2*1的矩形铺大矩形和这个问题一样。
 * Created by U-Demon
 * Date: 2020/6/12
 */
public class Fibonacci {

    public static int fib_rec(int n) {
        if (n <= 1)
            return n;
        return fib_rec(n - 1) + fib_rec(n - 2);
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        int f1 = 0, f2 = 1, f = 0;
        int i = 2;
        while (i++ <= n) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f;
    }

}
