class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int p1 = 0;
        int p2 = 1;

        while (p2 <= n && p1 < target.length) {

            // take the element from stream and push it list
            ans.add("Push");

            // if element at the top stack and steam is same 
            if (p2 == target[p1]) {
                p1++;
            } else {
                ans.add("Pop");
            }
            p2++;

        }

        return ans;
    }
}