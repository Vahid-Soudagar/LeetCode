class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1); // base case: prefix sum 0 has 1 count
        int count = 0, sum = 0;

        for (int num : nums) {
            sum += num;
            // Check if there exists a prefix with sum = sum - goal
            count += prefixSumFreq.getOrDefault(sum - goal, 0);
            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
