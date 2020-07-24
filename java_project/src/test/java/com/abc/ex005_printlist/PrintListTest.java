package com.abc.ex005_printlist;

import com.abc.data.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/10
 */
public class PrintListTest {

    ListNode head = null;

    @BeforeEach
    void setUp() {
        head = new ListNode(1);
        head.addNext(2).addNext(3).addNext(4).addNext(5);
    }

    @Test
    void test_1() {
        PrintList.print(head);
    }

    @Test
    void test_2() {
        PrintList.print_recur(head);
    }

}
