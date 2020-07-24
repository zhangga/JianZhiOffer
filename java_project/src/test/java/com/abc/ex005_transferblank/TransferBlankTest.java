package com.abc.ex005_transferblank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by U-Demon
 * Date: 2020/6/8
 */
public class TransferBlankTest {

    char[] str = null;
    char[] expected = new char[]{'w', 'e', '%', '2', '0', 'a', 'r', 'e', '%', '2', '0', 'h', 'a', 'p', 'p', 'y', '\0', ' '};

    @BeforeEach
    void setUp() {
        str = new char[]{'w', 'e', ' ', 'a', 'r', 'e', ' ', 'h', 'a', 'p', 'p', 'y', '\0', ' ', ' ', ' ', ' ', ' '};
    }

    @Test
    void test_1() {
        TransferBlank.transfer(str);
        assert Arrays.equals(str, expected);
    }
}
