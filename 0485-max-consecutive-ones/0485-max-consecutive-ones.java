class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sp = 0;
        int ep = 0;

        int maxCount = 0;
        // 2
        int count = 0;
        // 2
        while (ep < nums.length) {
            if (nums[ep] == 1) {
                count++;
                ep++;
            } else {
                count = 0;
                sp = ep;
                ep++;
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}