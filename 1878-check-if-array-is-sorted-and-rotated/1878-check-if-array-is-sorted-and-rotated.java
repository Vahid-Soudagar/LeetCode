class Solution {
    public boolean check(int[] nums) {

        // 3,4,5,1,2

        boolean noturn = false;
        boolean firstturn =true;
        for(int i=1;i<nums.length;i++){

            // i = 4
            
            // firstTurn = false
            // noturn = true
            // nums[i] = 2
            // nums[i-1] = 1
            // nums[i-1] <= nums[i] && !noturn = 1 <= 2 && false = true && false = false
            if(nums[i-1]<=nums[i] && !noturn){
                 continue;
            }
            else{
                noturn = true;
                if(firstturn){
                    if(nums[0]<nums[i]) {
                        return false;
                    }
                    firstturn = false;
                }
                else{
                    if(nums[0]<nums[i] || nums[i-1]>nums[i]) return false;
                }
            }
        }

        return true;
        
    }
}