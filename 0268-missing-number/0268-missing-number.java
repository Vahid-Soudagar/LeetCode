class Solution {
    public int missingNumber(int[] nums) {
        // 0 - 3 = 0 + 1 + 2 + 3 = 6
        int sum = getSum(nums.length);
        for (int i=0;i<nums.length;i++) {
            sum -= nums[i];
        }

        return sum;
    }

    private int getSum(int n) {
        int sum = 0;
        for (int i=0;i<=n;i++) {
            sum += i;
        }

        return sum;
    }
}