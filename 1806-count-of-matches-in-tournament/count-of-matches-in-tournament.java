class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;

        while (n > 1) {

            matches += n / 2;

            n = (n + 1) / 2; // Update the number of teams for the next round

        }

        return matches;
    }
}