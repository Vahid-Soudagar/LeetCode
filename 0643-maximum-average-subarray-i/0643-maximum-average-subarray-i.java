class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum  = 0;
        for (int i=0;i<k;i++) {
            sum += nums[i];
        }

        double avg = sum * 1.0 / k;
        double ans = avg;

        for (int i=k;i<nums.length;i++) {
            sum = (sum + nums[i]) - nums[i-k];
            avg = sum * 1.0 / k;
            ans = Math.max(avg, ans);
        }

        return ans;

    }
}