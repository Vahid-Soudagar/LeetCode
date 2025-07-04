class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: prefix sum 0 has occurred once

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            // if sum - k occurred before, add its count
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // record current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
