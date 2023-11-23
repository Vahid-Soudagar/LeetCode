class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0;i < l.length;i++) {
            int s = l[i];
            int e = r[i];

            boolean flag = true;

            int[] range = sort(nums, s, e);
            int d = range[1] - range[0];
            for (int j=0;j<range.length-1;j++) {
                if (range[j+1] - range[j] != d) {
                    flag = false;
                    ans.add(false);
                    break;
                }
            }

            if (flag) ans.add(true);
        }

        return ans;
    }

    private int[] sort(int[] nums, int s, int e) {
        int[] ans = new int[e-s+1];
        int count = 0;
        for (int i=s;i<=e;i++) {
            ans[count++] = nums[i];
        }

        Arrays.sort(ans);
        return ans;
    }
}