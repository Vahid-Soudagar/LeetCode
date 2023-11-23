class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        // 2 
        for (int i = 0;i < nums.length - 1;i++) {
            // i = 4
            if (nums[i+1] != nums[i]) {
                // i + 1 = 1 
                // i = 0
                nums[count++] = nums[i+1];
            }
        } 

        // 0 1
        return count;
    }
}