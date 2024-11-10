package KadaneAlgo;

public class MaximumAbsoluteSum {

    public static int maxAbsoluteSum(int[] nums) {
            // Initialize variables for the current and maximum subarray sum
            int maxSum = 0;
            int minSum = 0;
            int currentMax = 0;
            int currentMin = 0;

            // Iterate over the array
            for (int num : nums) {
                // Update current maximum subarray sum
                currentMax = Math.max(currentMax + num, num);
                maxSum = Math.max(maxSum, currentMax);

                // Update current minimum subarray sum
                currentMin = Math.min(currentMin + num, num);
                minSum = Math.min(minSum, currentMin);
            }

            // Return the maximum absolute sum
            return Math.max(maxSum, Math.abs(minSum));
        }

        public static void main(String[] args) {
            int[] nums = {2, -5, 1, -4, 3, -2};
            System.out.println("Maximum Absolute Sum: " + maxAbsoluteSum(nums)); // Output example
        }
}