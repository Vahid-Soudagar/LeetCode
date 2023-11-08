class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {

        int horizontalDistance = Math.abs(fx - sx);
        int verticalDistance = Math.abs(fy - sy);

        // edge case
        if (horizontalDistance == 0 && verticalDistance == 0 && t == 1) {
            return false;
        }

        int minTime = Math.max(horizontalDistance, verticalDistance);
        return t >= minTime;

    }
}