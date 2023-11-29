public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // we can get the ans by right shifting and suing for loop
        int count = 0;
        for (int i=31;i>=0;i--) {
            if (((n >> i) & 1) == 1) count++;
        } 

        return count;
    }
}