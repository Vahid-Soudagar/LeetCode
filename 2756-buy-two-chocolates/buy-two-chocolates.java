class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sumOfTwo = prices[0]+prices[1];
        if (money == sumOfTwo) {
            return 0;
        } else if (money > sumOfTwo) {
            return money - sumOfTwo;
        } else {
            return money;
        }
    }
}