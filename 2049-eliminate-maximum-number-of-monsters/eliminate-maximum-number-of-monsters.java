class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int[] time = new int[n];
        for (int i=0;i<n;i++) {
            int d = dist[i];
            int s = speed[i];
            int t = (int) Math.ceil((d * 1.0)/(s * 1.0));
            time[i] = t;
        }

        Arrays.sort(time);
        int count = 1;
        int charged = 0;
        int timePassed = 1;

        for (int i=1;i<n;i++) {
            if (time[i] - timePassed <= 0) {
                return count;
            }

            count++;
            timePassed++;
        }
        return count;
    }
}