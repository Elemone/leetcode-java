package com.elemone.leetcode.addtwonumbers;


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode retHead = new ListNode(0);
        ListNode curr = retHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            int currValue = sum % 10;
            curr.next = new ListNode(currValue);
            carry = sum / 10;
            curr = curr.next;
        }

        if (carry != 0) {
            curr.next = new ListNode(carry);
        }
        return retHead.next;
    }
}