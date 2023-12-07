class Solution {
    public String largestOddNumber(String num) {
        int ep = num.length() - 1;
        while (ep >= 0) {
            if ((num.charAt(ep) - '0') % 2 != 0) {
                return num.substring(0, ep + 1);
            } else {
                ep--;
            }
        }
        return "";
    }
}
