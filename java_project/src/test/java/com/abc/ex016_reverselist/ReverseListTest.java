package com.abc.ex016_reverselist;

import com.abc.data.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class ReverseListTest {

    private ListNode head;

    @BeforeEach
    void setUp() {
        head = new ListNode(1);
        head.addNext(2).addNext(3).addNext(4).addNext(5);
    }

    @Test
    void test_1() {
        ListNode first = ReverseList.reverse1(head);
        System.out.println(first.toString());
    }

    @Test
    void test_2() {
        ListNode first = ReverseList.reverse2(head);
        System.out.println(first.toString());
    }
}
