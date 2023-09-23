class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        // Iterate through the array with two pointers i and j
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] is equal to the target
                if (nums[i] + nums[j] == target) {
                    // If yes, store the indices in the result array and return
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
        // If no solution is found, return an empty array
        return new int[0];
    }
}
