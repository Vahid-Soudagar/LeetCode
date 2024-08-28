class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotate(nums, 0, nums.length - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
    }

    private void rotate(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];  // 1
            nums[i] = nums[j]; // 7
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

// 1,2,3,4,5,6,7 -> 7 1 2 3 4 5 6 -> 6 7 1 2 3 4 5 -> 5 6 7 1 2 3 4
// 1,2,3,4,5,6,7 -> 7 6 5 4 3 2 1 -> 5 6 7 4 3 2 1 -> 5 6 7 1 2 3 4
// 1 2 3 4 5 6 7 -> 7 6 5 4 3 2 1