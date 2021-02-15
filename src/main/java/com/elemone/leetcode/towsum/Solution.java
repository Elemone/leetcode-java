package com.elemone.leetcode.towsum;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
 * target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] + nums[1] == 9, we return [0,
 * 1].
 * <p>
 * Example 2: Input: nums = [3,2,4], target = 6 Output: [1,2]
 * <p>
 * Example 3: Input: nums = [3,3], target = 6 Output: [0,1]
 * <p>
 * Constraints:
 * <p>
 * 1. 2 <= nums.length <= 103 2. -109 <= nums[i] <= 109 3. -109 <= target <= 109 4. Only one valid answer exists.
 *
 * @author jianyuan
 * @version : Sulotion.java, v0.1 2021-02-13 11:12 下午 by jianyuan
 */
public class Solution {
    /**
     * Solution complexity:
     *  - time:  O(n)
     *  - space: O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        // AS "each input would have exactly one solution", NO validation here
        Map<Integer, Integer/*index*/> cache = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int expect = target - nums[i];
            Integer indOfExpect = cache.get(expect);
            if (indOfExpect != null) {
                return new int[] {i, indOfExpect};
            } else {
                cache.put(nums[i], i);
            }
        }
        // no result found
        return null;
    }
}
