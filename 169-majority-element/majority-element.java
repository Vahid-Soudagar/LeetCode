class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int times = nums.length / 2;
        int lastElement = nums[0];  
        int count = 1;
        for (int i = 1;i < nums.length;i++) {
            if (lastElement == nums[i]) {
                count++;
                if (count > times) {
                    System.out.println(lastElement);
                    return lastElement;
                }
            } else {
                lastElement = nums[i];
                count = 1;
            }
        }

        return lastElement;        
    }
}