// class Solution {
//     public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
//         List<Boolean> ans = new ArrayList<>();
//         for (int i = 0;i < l.length;i++) {
//             int s = l[i];
//             int e = r[i];

//             boolean flag = true;

//             int[] range = sort(nums, s, e);
//             int d = range[1] - range[0];
//             for (int j=0;j<range.length-1;j++) {
//                 if (range[j+1] - range[j] != d) {
//                     flag = false;
//                     ans.add(false);
//                     break;
//                 }
//             }

//             if (flag) ans.add(true);
//         }

//         return ans;
//     }

//     private int[] sort(int[] nums, int s, int e) {
//         int[] ans = new int[e-s+1];
//         int count = 0;
//         for (int i=s;i<=e;i++) {
//             ans[count++] = nums[i];
//         }

//         Arrays.sort(ans);
//         return ans;
//     }
// }

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int[] subarray = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            ans.add(check(subarray));
        }

        return ans;
    }

    private boolean check(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        
        return true;
    }
}