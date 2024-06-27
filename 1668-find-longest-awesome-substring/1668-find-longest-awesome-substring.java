class Solution {
    public int longestAwesome(String s) {
        int ans = 0;
        int mask = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int idx = 0; idx < s.length(); idx++) {
            mask ^= 1 << (s.charAt(idx) - '0');
            if (map.containsKey(mask)) {
                ans = Math.max(ans, idx - map.get(mask));
            } else {
                map.put(mask, idx);
            }

            for (int shift = 0; shift < 10; shift++) {
                int mask2 = mask ^ (1 << shift);
                if (map.containsKey(mask2)) {
                    ans = Math.max(ans, idx - map.getOrDefault(mask2, 0));
                }
            }
        }

        
        return ans;
    }
}