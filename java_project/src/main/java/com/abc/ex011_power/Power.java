package com.abc.ex011_power;

/**
 * Created by U-Demon
 * Date: 2020/6/16
 */
public class Power {

    public static double doPower(double n, int power) {
        if (equal(n, 0))
            return 0;
        if (power == 0)
            return 1;

        boolean exponent = power < 0;
        power = Math.abs(power);

        double num = n;
        int i = 1;
        while (i < power) {
            if (i * 2 <= power) {
                num *= num;
                i *= 2;
            }
            else {
                num *= n;
                i++;
            }
        }
        return exponent ? 1/num : num;
    }

    private static boolean equal(double n1, double n2) {
        return Math.abs(n1 - n2) < 0.0000001;
    }

}
