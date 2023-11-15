class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        // first step sort the array

        // than there will be two cases
            // 1. the first element of array is 1
            // than check for every other element it satisfies the condition if it does 
            // move next element and if does not reduce the number i by (i - 1) + 1 
            // 2. the second case will be that the first element is not 1 so we have to reduce the number the first element to 1
            // after reducing check for the second condition and do the operation if needed4
        
        // the last elment of the aeeay is the maximum element element so return the ans;

        // dry run with example one and two
        // example 1
        // input = [2,2,1,2,1] output = 2  
        // step 1.
            // arr = 1,1,2,2,2
        // step 2.
            // in the example the first element is already one we have to checl for the second condition
                // i = 1, i < arr.length, i++
                // arr[i] - arr[i-1] <= 1
                // i = 1, arr[i] = 1, arr[i-1] = 1
                // arr[i] - arr[i-1] <= 1
                // 1 - 1 <= 1
                // i = 2, arr[i] = 2, arr[i-1] = 1
                // arr[i] - arr[i-1] <= 1
                // 2 - 1 <= 1
                // i = 3, arr[i] = 2, arr[i-1] = 2
                // arr[i] - arr[i-1] <= 1
                // 2 - 2 <= 0
                // i = 2, arr[i] = 2, arr[i-1] = 2
                // arr[i] - arr[i-1] <= 1
                // 2 - 2 <= 0

        // last step 
        // return the last element of the array arr[arr.length - 1] 
        // return 2

        // example 2
        // input = [2,2,2] output = 22 
        // step 1.
            // arr = 2,2,2
        // step 2.
            // in the example the first element is not one 
            // so we have to reduce the first element to 1
            // after reducing the first element the arr will look like this
            // arr = [1, 2, 2]
            // now check for the condition 
                // i = 1, i < arr.length, i++
                // arr[i] - arr[i-1] <= 1
                // i = 1, arr[i] = 2, arr[i-1] = 1
                // arr[i] - arr[i-1] <= 1
                // 2 - 1 <= 1
                // i = 2, arr[i] = 2, arr[i-1] = 2
                // arr[i] - arr[i-1] <= 1
                // 2 - 2 <= 1

        // last step 
        // return the last element of the array arr[arr.length - 1] 
        // return 2


        // code for the above problem
        // step 1
        int n = arr.length;
        Arrays.sort(arr);

        // if (arr[0] == 1) {
        //     for (int i=1;i<n;i++) {
        //         if (Math.abs(arr[i] - arr[i-1]) > 1) {
        //             arr[i] = arr[i-1]+1;
        //         } 
        //     }
        // } else {
        //     arr[0] = 1;
        //     for (int i=1;i<n;i++) {
        //         if (Math.abs(arr[i] - arr[i-1]) > 1) {
        //             arr[i] = arr[i-1]+1;
        //         } 
        //     }
        // }

        arr[0] = 1;
        for (int i=1;i<n;i++) {
            if (Math.abs(arr[i] - arr[i-1]) > 1) {
                arr[i] = arr[i-1]+1;
            } 
        }

        return arr[n-1];
    }
} 
