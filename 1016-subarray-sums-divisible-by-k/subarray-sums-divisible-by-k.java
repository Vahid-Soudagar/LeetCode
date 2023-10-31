class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // 
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        // initial element
        map.put(0, 1);
        // to get the sum
        int sum = 0;
        // for the remainder purpose
        int rem = 0;
        for (int i=0;i<nums.length;i++) {
            // add the element to sum
            sum += nums[i];
            // take remainder from sum
            rem = sum % k;
            // if the rem is less do this
            if (rem < 0) {
                rem += k;
            }

            // if map contains key than we can find the result
            if (map.containsKey(rem)) {
                result += map.get(rem);
                // increase by 1
                map.put(rem, map.get(rem) + 1);
            } else {
                map.put(rem, 1);
            }

        }

        return result;
    }
}