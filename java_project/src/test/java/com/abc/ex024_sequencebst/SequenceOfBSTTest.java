package com.abc.ex024_sequencebst;

import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/22
 */
public class SequenceOfBSTTest {
    int[] seq1 = {5, 7, 6, 9, 11, 10, 8};
    int[] seq2 = {7, 4, 6, 5};

    @Test
    void test_1() {
        assert true == SequenceOfBST.verify(seq1);
    }

    @Test
    void test_2() {
        assert false == SequenceOfBST.verify(seq2);
    }
}
