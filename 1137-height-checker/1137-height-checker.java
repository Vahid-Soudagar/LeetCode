class Solution {
    public int heightChecker(int[] heights) {
        int[] og = Arrays.copyOf(heights, heights.length);
        int count = 0;
        Arrays.sort(heights);
        for (int i=0;i<og.length;i++) {
            if (heights[i] != og[i]) {
                count++;
            }
        }
        return count;
    }
}