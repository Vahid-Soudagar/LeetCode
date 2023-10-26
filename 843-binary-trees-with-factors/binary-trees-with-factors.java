class Solution {

    private static final int MOD = 1000000007;

    public int numFactoredBinaryTrees(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);
       
        HashMap<Integer,Long> map = new HashMap<>();
        map.put(arr[0], 1L);

        for (int i=1;i<n;i++) {
            long count = 1;

            for (int j=0;j<i;j++) {
                int lc = arr[j];

                if (arr[i] % lc == 0 && map.containsKey(arr[i]/lc)) {
                    count += (map.get(lc) * map.get(arr[i]/lc)) % MOD;
                    count %= MOD;
                }
            }

            map.put(arr[i], count);
        }
        int result = 0;
        for (long val : map.values()) {
            result = (int) ((result + val) % MOD);
        }
        return result;
    }
}