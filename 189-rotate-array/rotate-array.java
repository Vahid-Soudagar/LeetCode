class Solution {
    public void rotate(int[] nums, int k) {
        // to solve this problem we have to do this is three steps
        // 1) first we have to reverse the array from 0 to nums.length - k
        // 2) than we have to reverse the last k elements
        // 3) at final we have to reverse the whole array
        // 
        // after performing this steps are array will be rotated by k steps 
        // if (nums.length < k) {
        //     return;
        // }
        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length-1);
    }

    private void reverse(int[] nums, int s, int e) {

        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }

    }
}