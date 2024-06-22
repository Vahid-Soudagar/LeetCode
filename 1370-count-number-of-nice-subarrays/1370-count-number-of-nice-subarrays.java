class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int ep = 0;
        int sp = 0;
        int countOfNA = 0;
        int count = 0;
        int n = nums.length;
        int ans = 0;

        while (ep < n) {
            // 1 1 2 1
            if (nums[ep] % 2 != 0) {
                count++;
                // 0
                countOfNA = 0;
            }
            while (count == k) {
                countOfNA++;
                // 3
                // if spth element is odd than only decrease the count
                if (nums[sp]%2 !=0) {
                    count--;
                }
                sp++;
            }
            ans += countOfNA;
            // 
            ep++;
        }

        return ans;
    }
}