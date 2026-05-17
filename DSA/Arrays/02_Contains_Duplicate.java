/*
Question:
LeetCode 217 - Contains Duplicate

Pattern:
HashSet

Brute Force Approach:
Compare every pair using nested loops.

Time Complexity: O(n²)
Space Complexity: O(1)

Optimized Approach:
Use HashSet to track visited elements.

For every number:
1. If already present in set:
      duplicate found
2. Else add into set

Optimized Complexity:
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {

            if(set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }
}