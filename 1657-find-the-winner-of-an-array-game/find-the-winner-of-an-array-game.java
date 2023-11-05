class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        // take ou the max 
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }

        if (k >= n) {
            return max;
        } else {
            int winner = arr[0];
            int streak = 0;

            for (int i=1;i<n;i++) {
                if (arr[i] > winner) {
                    winner = arr[i];
                    streak = 1;
                } else {
                    streak++;
                }

                if (streak == k || winner == max) {
                    return winner;
                }
            }
        }

        return -1;
    }
}