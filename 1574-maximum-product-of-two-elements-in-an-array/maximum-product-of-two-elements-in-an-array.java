class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int lE = nums[n-1];
        int sLE = nums[n-2];

        int ans = (lE - 1) * (sLE - 1);
        return ans;   
    }
}