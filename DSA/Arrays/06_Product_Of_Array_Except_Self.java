/*
Question:
LeetCode 238 - Product of Array Except Self

Pattern:
Prefix Product + Suffix Product

Brute Force Approach:
For every index:
Multiply all elements except itself.

Time Complexity: O(n²)
Space Complexity: O(1)

Optimized Approach:
Observation:
answer[i] =
(product of left side)
×
(product of right side)

Use:
1. Prefix product array
2. Suffix product array

Then:
answer[i] = prefix[i] * suffix[i]

Optimized Complexity:
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] answer = new int[n];

        // First element has no left side
        prefix[0] = 1;

        // Build prefix array
        for(int i = 1; i < n; i++) {

            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Last element has no right side
        suffix[n - 1] = 1;

        // Build suffix array
        for(int i = n - 2; i >= 0; i--) {

            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Build final answer
        for(int i = 0; i < n; i++) {

            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}