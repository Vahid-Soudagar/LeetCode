class Solution {
    public String largestGoodInteger(String num) {
        int last = Integer.MIN_VALUE;
        int count = 1;
        // 1

        for (int i=0;i<num.length()-1;i++) {
            char ch1 = num.charAt(i);
            // 2
            char ch2 = num.charAt(i+1);
            // 1

            if (ch1 == ch2) {
                count++;
            }

            if (count == 3) {
                last = Math.max(last, Character.getNumericValue(ch1));
            }

            if (ch1 != ch2) {
                count = 1;
            }
        }

        return last == Integer.MIN_VALUE ? "" : String.valueOf(last)+last+last;
    }
}