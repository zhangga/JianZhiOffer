package com.abc.ex012_printnum;

/**
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class PrintNum {

    public static void print(int n) {
        if (n < 1)
            return;
        // long可表示的范围
        if (n < 19) {
            long i = 0, max = 1;
            while (i++ < n) {
                max *= 10;
            }
            for (i = 1; i < max; i++) {
                System.out.println(i);
            }
        }
        // string表示
        else {
            char[] digits = new char[n];
            for (int i = n-1; i >= 0; i--) {
            }
        }
    }

}
