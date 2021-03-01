package com.elemone.leetcode;

public class LC66PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int tmp;
        for (int i = digits.length - 1; i >= 0; i--) {
            tmp = digits[i] + carry;
            carry = tmp / 10; // digit: 0 ~ 9,
            digits[i] = tmp % 10;
        }
        if (carry > 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}
