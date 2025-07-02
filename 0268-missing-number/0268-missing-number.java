class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorAll = 0;
        int xorNum = 0;

        for (int i=0;i<=n;i++) {
            xorAll = xorAll ^ i;
        }

        for (int i=0;i<n;i++) {
            xorNum = xorNum ^ nums[i];
        }

        return xorAll ^ xorNum;
    }
}