class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return countSubArrays(nums, right) - countSubArrays(nums, left - 1);
    }

    private int countSubArrays(int[] nums, int bound) {
        int count = 0;
        int current = 0;
        for (int num : nums) {
            if (num <= bound) {
                current++;
            } else {
                current = 0;
            }
            count += current;
        }

        return count;
    }
}
