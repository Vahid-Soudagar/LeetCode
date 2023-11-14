class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<Character> character = new HashSet<>();
        for (int i = 0;i < s.length();i++) {
            character.add(s.charAt(i));
        }

        int ans = 0;

        for (char ch : character) {
            int leftIndex = -1;
            int rightIndex = -1;

            for (int i = 0;i<n;i++) {
                if (s.charAt(i) == ch) {
                    if (leftIndex == -1) {
                        leftIndex = i;
                    }

                    rightIndex = i;
                }
            }

            Set<Character> set = new HashSet<>();
            for (int mid = leftIndex+1;mid < rightIndex;mid++) {
                set.add(s.charAt(mid));
            }

            ans += set.size();
        }

        return ans;
    }
}