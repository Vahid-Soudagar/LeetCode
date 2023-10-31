// Define a class named 'Solution'
class Solution {
    
    // Define a method 'findArray' that takes an integer array 'pref' as input
    public int[] findArray(int[] pref) {
        // Create a new integer array 'result' with the same length as 'pref'
        int[] result = new int[pref.length];
        
        // Set the first element of 'result' to be the same as the first element of 'pref'
        result[0] = pref[0];

        // Loop through the 'pref' array, starting from the second element (index 1)
        for (int i = 1; i < pref.length; i++) {
            // Calculate the value at the current index in 'result' by performing a bitwise XOR operation
            // between the current element in 'pref' and the previous element in 'pref'
            result[i] = pref[i] ^ pref[i - 1];
        }

        // Return the 'result' array, which now contains the modified values
        return result;
    }
}