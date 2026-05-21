/*
Question:
LeetCode 152 - Maximum Product Subarray

Pattern:
Dynamic Programming / Kadane Variant

Brute Force Approach:
Generate all possible subarrays.
Find product of each subarray.
Store maximum product.

Time Complexity: O(n²)
Space Complexity: O(1)

Optimized Approach:
Key Observation:
Negative × Negative = Positive

So at every index we must track:
1. Maximum product till current index
2. Minimum product till current index

Why minimum?
Because a large negative product can become
maximum after multiplying another negative number.


Optimized Complexity:
Time Complexity: O(n)
Space Complexity: O(1)
*/

class MaximumProductSubarray {

    // Optimized Solution
    public static int maxProduct(int[] nums) {

        int p_max = nums[0];
        int p_min = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {

            int current = nums[i];

            // Store old max before updating
            int temp = p_max;

            // Update maximum product
            p_max = Math.max(
                        current,
                        Math.max(current * p_max,
                                 current * p_min)
                    );

            // Update minimum product
            p_min = Math.min(
                        current,
                        Math.min(current * temp,
                                 current * p_min)
                    );

            // Update final answer
            result = Math.max(result, p_max);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2,3,-2,4};

        System.out.println(maxProduct(nums));
    }
}