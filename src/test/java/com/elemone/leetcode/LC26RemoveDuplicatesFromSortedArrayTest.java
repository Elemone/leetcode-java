package com.elemone.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LC26RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void test() {
        LC26RemoveDuplicatesFromSortedArray solution = new LC26RemoveDuplicatesFromSortedArray();
        // case 1:  1,1,2 -> 1,2
        run(solution, new int[] {1,1,2}, new int[] {1,2});
        // case 2:  0,0,1,1,1,2,2,3,3,4 -> 0,1,2,3,4
        run(solution, new int[] {0,0,1,1,1,2,2,3,3,4}, new int[] {0,1,2,3,4});

    }

    private void run(LC26RemoveDuplicatesFromSortedArray solution, int[] arr, int[] expect) {
        int len = solution.removeDuplicates(arr);
        Assert.assertEquals(expect.length, len);
        Assert.assertArrayEquals(Arrays.copyOf(arr, len), expect);

    }
}
