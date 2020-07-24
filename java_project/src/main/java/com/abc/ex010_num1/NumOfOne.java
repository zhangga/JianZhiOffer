package com.abc.ex010_num1;

/**
 * 二进制中1的个数
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class NumOfOne {

    public static int num(int n) {
        int num = 0;
        while (n != 0) {
            if ((n & 1) != 0)
                num++;
            n = n >>> 1;
        }
        return num;
    }

    public static int num1(int n) {
        int num = 0;
        while (n != 0) {
            num++;
            n &= n-1;
        }
        return num;
    }

}
