class Solution {
    public int removeDuplicates(int[] nums){
        // min = 0
        // max = 4
        // uniCount = (max - min) + 1 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<nums.length;i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int uniCount = 1;
        int index = 1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i-1] == nums[i]) {
                continue;
            } else {
                uniCount++;
                nums[index++] = nums[i];
            }
        }
        System.out.println(uniCount);
        return uniCount;
    }
}