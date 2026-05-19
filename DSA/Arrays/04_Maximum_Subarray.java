/*
Question:
LeetCode 53 - Maximum Subarray

Pattern:
Kadane's Algorithm

Optimized Approach:
1. Keep running sum
2. Update maximum sum
3. If running sum becomes negative, reset to 0

Time Complexity: O(n)
Space Complexity: O(1)
*/

class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            maxSum = Math.max(maxSum, currentSum);

            // Reset if sum becomes negative
            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }
}