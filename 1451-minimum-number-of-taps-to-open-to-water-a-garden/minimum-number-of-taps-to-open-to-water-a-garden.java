class Solution {
    public int minTaps(int n, int[] ranges) {

        int minTaps = 0;
        int min = 0;
        int max = 0;

        while (max < n) {
            for (int i = 0;i < ranges.length;i++) {
                if (i - ranges[i] <= min && i + ranges[i] > max) {
                    max = ranges[i] + i;
                }
            }

            if (min == max) {
                return -1;
            }
            min = max;
            minTaps++;
        }

        return minTaps;
    }
}