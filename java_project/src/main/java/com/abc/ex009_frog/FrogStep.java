package com.abc.ex009_frog;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级......它也可以跳上n级，该青蛙
 * 跳上一个共n级的台阶共有多少种跳法？
 * 和普通青蛙跳台阶的问题一样，使用动态规划的思想，青蛙最后一步可以跳1级，2级...n级。
 * f(n) = f(n-1) + f(n-2) + ... + f(n-n)
 * f(n) = f(0) + f(1) + ... + f(n-1)
 * f(n) = f(n-1) + f(n-1) = 2 * f(n-1)
 * f(n) = 2^(n-1)
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class FrogStep {

    public static int step_rec(int n) {
        if (n < 1)
            return 0;
        else if (n == 1)
            return 1;
        return 2 * step_rec(n - 1);
    }

    public static int step(int n) {
        if (n < 1)
            return 0;
        return (int) Math.pow(2, n-1);
    }

}
