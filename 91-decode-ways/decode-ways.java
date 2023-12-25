class Solution {
    int[] dp = new int[101];
    public int numDecodings(String s) {
        int n = s.length();
        Arrays.fill(dp, -1);
        return solve(0, s, n);
    }

    private int solve(int i,String s, int n) {
        if (dp[i] != -1) {
            return dp[i];
        }
        if (i == n){
            return dp[i] = 1; // find one possible split
        }

        if (s.charAt(i) == '0') {
            return dp[i] = 0; // not valid
        }

        int res = solve(i+1, s, n);
        if (i + 1 < n) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i+1) <= '6')) {
                res += solve(i+2, s, n);
            }
        }

        return dp[i] = res;
    }
}