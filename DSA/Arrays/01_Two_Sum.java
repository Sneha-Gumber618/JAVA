
/*
Question:
LeetCode 1 - Two Sum

Pattern:
HashMap

Brute Force Approach:
Use nested loops and check every pair.

Time Complexity: O(n²)
Space Complexity: O(1)

Optimized Approach:
Use HashMap to store:
number -> index

For every element:
1. Find complement = target - nums[i]
2. Check if complement already exists
3. If exists, return indexes
4. Else store current number

Optimized Complexity:
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}