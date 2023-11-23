class Solution {
    public int removeDuplicates(int[] nums) {   
        int newIndex = 1; // Start with index 1 because the first element is already in place

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i+1]) { // If the current element is less than the next element
            
                nums[newIndex] = nums[i+1]; // Move the next element to the new index
                newIndex++; // Increment the new index
            }
        }
        return newIndex; // Return the length of the new subarray
	}
}