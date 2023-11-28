class Solution {
    int MOD = 1_000_000_007;

    public int numberOfWays(String corridor) {
        long res=1;
        long seat=0, plant=0;
        // 1       0
        for(char ch:corridor.toCharArray()){
            //  S   S   P   P   S   P   S
            if(ch=='S'){
                if(seat==2){
                    // multiply the counts of plants (+1) in between every 2 seats
                    res = res * (plant + 1) % MOD;
                    // 1 = 1 * (2 + 1) % Mod
                    // 3
                    seat = plant = 0;
                }
                seat++;
            } 
            // only count plants after you've seen 2 seats (ignore in-between plants)
            else if(seat == 2){
                plant++;
            }
        }

    // ensure the last section has 2 seats i.e. the total number of seats is >=2 and even
        return seat==2?(int)res:0;
    }
}