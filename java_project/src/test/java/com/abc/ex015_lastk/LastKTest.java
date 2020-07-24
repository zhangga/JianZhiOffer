package com.abc.ex015_lastk;

import com.abc.data.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class LastKTest {

    private ListNode head;

    @BeforeEach
    void setUp() {
        head = new ListNode(1);
        head.addNext(2).addNext(3).addNext(4).addNext(5);
    }

    @Test
    void test_1() {
        assert LastK.find(head, 3).value == 3;
    }

    @Test
    void test_2() {
        assert LastK.find(head, 7).value == 4;
    }

}
