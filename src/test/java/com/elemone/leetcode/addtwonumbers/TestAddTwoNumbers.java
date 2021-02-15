package com.elemone.leetcode.addtwonumbers;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jianyuan
 * @version : Test.java, v0.1 2021-02-15 9:58 下午 by jianyuan
 */
public class TestAddTwoNumbers {

    @Test
    public void test() {
        // 243
        // 546
        ListNode l1 = fromSeq(2, 4, 3);
        ListNode l2 = fromSeq(5, 4, 6);

        ListNode listNode = new Solution().addTwoNumbers(l1, l2);
        int[] expect = new int[] {7,8,9};
        for (int i = 0; i < expect.length; i++) {
            Assert.assertNotNull(listNode);
            Assert.assertEquals(expect[i], listNode.val);
            listNode = listNode.next;
        }

        // 244
        // 564
    }


    ListNode fromSeq(int... arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    private String toString(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        while (listNode != null) {
            sb.append(listNode.val);
            listNode = listNode.next;
        }
        return sb.toString();
    }
}
