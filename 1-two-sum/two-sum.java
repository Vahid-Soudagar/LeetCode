class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i=0;i<nums.length;i++) {
            int comple = target - nums[i];
            // 3 4 2
            if (map.containsKey(comple)) {
                ans[0] = i;
                ans[1] = map.get(comple);
                return ans;
            }

            map.put(nums[i], i);
            // 3-0
            // 2-1
        } 

        return ans;
    }
}