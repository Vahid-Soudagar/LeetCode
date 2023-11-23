class Solution {
    public int removeDuplicates(int[] nums) {   
        // [0,0,1,1,1,1,2,3,3]
        // 0 0 1 1
        int newIndex = 1; 
        // 4
        int dup = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            // i = 3
            // the elemen can be duplicate or can not be
            if (nums[i+1] == nums[i]) {
                // is duplicate
                // i + 1 = 1
                // i = 1
                if (dup < 2) {
                    // duplicate element is less than 2
                    nums[newIndex++] = nums[i];
                    dup++;
                    // dup = 1
                } 
            } else {
                // is not dulicate
                nums[newIndex++] = nums[i+1];
                dup = 1;
            }
        }
        return newIndex; // Return the length of the new subarray
	}
}