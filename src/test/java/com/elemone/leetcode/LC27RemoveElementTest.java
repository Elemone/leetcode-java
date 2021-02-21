package com.elemone.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LC27RemoveElementTest {
    @Test
    public void test() {
        LC27RemoveElement solution = new LC27RemoveElement();
        // case 1:  [3,2,2,3] - 3 = [2,2]
        doRun(solution, new int[] {3,2,2,3}, 3, new int[] {2, 2});
        // case 2:  [0,1,2,2,3,0,4,2] -  2  = [0,1,4,0,3]
        doRun(solution, new int[] {0,1,2,2,3,0,4,2}, 2, new int[] {0,1,3,0,4});

    }

    private void doRun(LC27RemoveElement solution, int[] input, int elem, int[] expect) {
        int len = solution.removeElement(input, elem);
        Assert.assertEquals(len, expect.length);
        Assert.assertArrayEquals(expect, Arrays.copyOf(input, len));
    }
}
