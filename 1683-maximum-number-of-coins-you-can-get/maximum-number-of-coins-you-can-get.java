class Solution {
    public int maxCoins(int[] piles) {
        // to solve this question we have ti first dry run 
        // we will dry run with this example
        // piles = 9,8,7,6,5,1,2,3,4
        // so alice will chose the max number, i will choose the number strictly less than alice and greate than all i.e 
        // second max number and bob will choose the last pile i.e min number 
        // so in this example 
        // alice -> 9 , 7, 5 = 21
        // you -> 8 , 6, 4 = 18
        // bob -> 1, 2, 3 = 6
        // so we got the right answer
        // now to solve this question we can sort the array first 
        // after sorting the array will look like this
        // 1,2,3,4,5,6,7,8,9
        // create a variable ans with value = 0
        // for alice choose the last index 
        // for you choose the second last index
        // for bob choose the first index
        // add the coins choosen by you in ans
        // after this decrease the alice index by 2
        // your index by 2 and increase the index of bob by 1
        // next collection of coins will be
        // in this way question will be solved

        Arrays.sort(piles);
        int a = piles.length - 1;
        int y = a - 1;
        int b = 0;

        int ans = 0;

        while (a > b) {
            // int aC = piles[a];
            int yC = piles[y];
            // int bC = piles[b];
            ans += yC;
            a = a - 2;
            y = a - 1;
            b++;
        }
        return ans;
    }
}