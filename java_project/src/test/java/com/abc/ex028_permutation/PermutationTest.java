package com.abc.ex028_permutation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by U-Demon
 * Date: 2020/7/24
 */
public class PermutationTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void test1() {
        Permutation p = new Permutation();
        String[] res = p.permutation_cut("aba");
        System.out.println(Arrays.toString(res));
    }

    @Test
    void test2() {
        Permutation p = new Permutation();
        p.permutation_swap("abc");
    }

}
