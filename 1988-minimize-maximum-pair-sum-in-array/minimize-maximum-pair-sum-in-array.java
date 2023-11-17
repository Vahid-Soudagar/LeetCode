class Solution {
    public int minPairSum(int[] nums) {
        // the question states that we have to find the maximum sum pair after pairing the elements;
        // for example
        //      3,5,2,3
        // this can be pair like
        // 3+5, 2+3 -> 8, 5 
        // but the ans is 7
        // so wehave to pair it in a way that the maximum sum must be minimum of all
        // see this paring of the same example
        //  3, 5, 2, 3
        // 3 + 3, 5+2 -> 6, 7 we got the ans
        // to solve this question first we have to sort the array
        // after sorting the array will look like this
        // 2, 3, 3, 5
        // step 2 is to use two pointer approach to pair and get the maximum sum
        
        // solution
        // step 1 - sorting the array
        Arrays.sort(nums);
        // step 2 - two pointer
        int sp = 0;
        int ep = nums.length - 1;
        int max = Integer.MIN_VALUE;
        while (sp < ep) {
            int pairSum = nums[sp] + nums[ep];
            max = Math.max(max, pairSum);
            sp++;
            ep--;
        }
        return max;
    }
}