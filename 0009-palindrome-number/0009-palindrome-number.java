class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (reverse(x) == x) {
            return true;
        }
        return false;
    }

    private int reverse(int n) {
        int k = n;
        int rev = 0;
        while (k != 0) {
            int rem = k % 10;
            rev = rev * 10 + rem;
            k = k / 10;
        }

        return rev;
    }
}