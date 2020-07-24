package com.abc.ex017_mergelist;

import com.abc.data.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by U-Demon
 * Date: 2020/6/18
 */
public class MergeListTest {

    private ListNode head1;
    private ListNode head2;

    @BeforeEach
    void setUp() {
        head1 = new ListNode(1);
        head1.addNext(3).addNext(5).addNext(7);
        head2 = new ListNode(2);
        head2.addNext(4).addNext(6).addNext(8);
    }

    @Test
    void test_1() {
        ListNode head = MergeList.merge(head1, head2);
        System.out.println(head);
    }
}
