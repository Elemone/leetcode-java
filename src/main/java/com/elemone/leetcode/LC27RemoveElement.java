package com.elemone.leetcode;

public class LC27RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0 ) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        return j;
    }
}
