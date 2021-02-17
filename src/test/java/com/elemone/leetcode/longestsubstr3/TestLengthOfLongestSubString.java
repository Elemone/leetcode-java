package com.elemone.leetcode.longestsubstr3;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestLengthOfLongestSubString {
    @Test
    public void test() {
        Map<String, Integer> cases = new HashMap<String, Integer>();
        cases.put("", 0);
        cases.put("abcabcbb", 3);
        cases.put("bbbbb", 1);
        cases.put("pwwkew", 3);
        // failed case: need find back
        cases.put("dvdf", 3);
        cases.put("aab", 2);

        Solution solution = new Solution();
        for (Map.Entry<String, Integer> stringIntegerEntry : cases.entrySet()) {
            String str = stringIntegerEntry.getKey();
            Integer expect = stringIntegerEntry.getValue();
            int solutionRet = solution.lengthOfLongestSubstring(str);
            System.out.println(str + " : " + solutionRet + ", expect: " + expect);
            Assert.assertEquals(expect.intValue(), solutionRet);
        }
    }
}
