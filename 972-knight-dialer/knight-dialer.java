// class Solution {

//     private static final int M = 1000000007;
//     private static final List<List<Integer>> adj = Arrays.asList(
//             Arrays.asList(4, 6),
//             Arrays.asList(6, 8),
//             Arrays.asList(7, 9),
//             Arrays.asList(4, 8),
//             Arrays.asList(3, 9, 0),
//             Arrays.asList(),
//             Arrays.asList(1, 7, 0),
//             Arrays.asList(2, 6),
//             Arrays.asList(1, 3),
//             Arrays.asList(2, 4)
//     );

//     int[][] dp = new int[50001][10];

//     public int knightDialer(int n) {

//         int result = 0;
//         Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
//         for (int i=0;i<=9;i++){
//             result = (result + solve(n - 1, i)) % M;
//         } 

//         return result;
//     }

//     private int solve(int n, int cell) {
//         if (n == 0) {
//             return 1;
//         }

//         if (dp[n][cell] != -1) {
//             return dp[n][cell];
//         }

//         int result = 0;
//         for (int nbr : adj.get(cell)) {
//             result = (result + solve(n - 1, nbr)) % M;
//         }

//         return dp[n][cell] = result;
//     }
// }

class Solution {
    private static final int[][] EDGES = {
        {4, 6},
        {6, 8},
        {7, 9},
        {4, 8},
        {0, 3, 9},
        {},
        {0, 1, 7},
        {2, 6},
        {1, 3},
        {2, 4}
    };
    private static final int MOD = 1_000_000_007;

    public int knightDialer(int n) {
        int[][] f = new int[2][10];
        int o = 0;

        for (int i = 0; i <= 9; ++i) {
            f[0][i] = 1;
        }

        for (int j = 2; j <= n; ++j) {
            o = 1 - o;

            for (int i = 0; i <= 9; ++i) {
                f[o][i] = 0;

                for (int num : EDGES[i]) {
                    f[o][i] = (f[o][i] + f[1 - o][num]) % MOD;
                }
            }
        }

        int res = 0;

        for (int i = 0; i <= 9; ++i) {
            res = (res + f[o][i]) % MOD;
        }

        return res;
    }
}