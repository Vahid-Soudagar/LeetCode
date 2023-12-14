class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        ArrayList<Integer> onesList = new ArrayList<>();
        ArrayList<Integer> zerosList = new ArrayList<>();

        // Calculate row counts
        for (int row = 0; row < m; row++) {
            int ones = 0;
            int zeros = 0;
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1) {
                    ones++;
                } else if (grid[row][col] == 0) {
                    zeros++;
                }
            }
            onesList.add(ones);
            zerosList.add(zeros);
        }

        // Calculate column counts
        for (int col = 0; col < n; col++) {
            int ones = 0;
            int zeros = 0;
            for (int row = 0; row < m; row++) {
                if (grid[row][col] == 1) {
                    ones++;
                } else if (grid[row][col] == 0) {
                    zeros++;
                }
            }
            onesList.add(ones);
            zerosList.add(zeros);
        }

        // Calculate differences
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int rowsOne = onesList.get(i);
                int colsOne = onesList.get(m + j); // Corrected indexing
                int rowsZero = zerosList.get(i);
                int colsZero = zerosList.get(m + j); // Corrected indexing

                int diff = rowsOne + colsOne - rowsZero - colsZero;
                grid[i][j] = diff;
            }
        }

        return grid;
    }
}
