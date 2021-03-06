package com.elemone.leetcode.longestsubstr3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String  s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        Map<Character, Integer> charIndex = new HashMap<>();
        char curr;
        int maxLen = 0;
        for (int i = 0, j = 0 ; i < s.length(); i++) {
            curr = s.charAt(i);
            if (charIndex.containsKey(curr)) {
                j = Math.max(charIndex.get(curr) + 1, j);
            }
            maxLen = Math.max(maxLen, i - j + 1);
            charIndex.put(curr, i);
        }
        return maxLen;
    }

    public int lengthOfLongestSubstringOld(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        Map<Character, Integer> charIndex = new HashMap<>();
        int maxLen = 0;
        char curr;
        for (int i = 0; i < s.length(); ) {
            curr = s.charAt(i);
            if (charIndex.containsKey(curr)) {
                i = charIndex.get(curr) + 1;
                if (charIndex.size() > maxLen) {
                    maxLen = charIndex.size();
                }
                charIndex.clear();
            } else {
                charIndex.put(curr, i);
                i++;
            }
        }
        return charIndex.size() > maxLen ? charIndex.size() : maxLen;
    }
}
