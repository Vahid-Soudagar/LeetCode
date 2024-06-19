class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        System.out.println(bloomDay.length);
        int n = bloomDay.length;
        if (((long) m * (long) k) > n) {
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int val : bloomDay) {
            low = Math.min(low, val);
            high = Math.max(high, val);
        }
        
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // mid = 5, bouq = 3, totalFlowers = 1
    public boolean isPossible(int[] arr, int mid, int bouq, int totalFlowers) {
        int flower = 0;
        // flower = 0
        int b = 0;
        // b = 1
        for (int i=0;i<arr.length;i++) {
            int ele = arr[i];
            // ele = 1
            if (ele <= mid) {
                flower++;
                if (flower >= totalFlowers) {
                    b++;
                    flower = 0;
                }
            } else {
                flower = 0;
            }
        }

        return b >= bouq;
    }

}