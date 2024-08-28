class Solution {
    public void moveZeroes(int[] nums) {
        int refillIndex = 0;
        int zeroCount = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                nums[refillIndex++] = nums[i];
            }
        } 

        for (int i=nums.length-1;i>=nums.length - zeroCount;i--) {
            nums[i] = 0;
        } 
    }
}