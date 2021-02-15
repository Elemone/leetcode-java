package com.elemone.leetcode.addtwonumbers;

/**
 * Definition for singly-linked list.
 *
 * @author jianyuan
 * @version : ListNode.java, v0.1 2021-02-15 5:04 下午 by jianyuan
 */
public class ListNode {
    int      val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
