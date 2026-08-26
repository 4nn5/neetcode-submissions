class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 2){
            return Math.min(cost[0], cost[1]);
        }

        int prev = 0;
        int curr = 0;

        for(int i = 2; i <= cost.length; i ++){
            int curr1 = Math.min(cost[i - 1] + curr, cost[i - 2] + prev);
            prev = curr;
            curr = curr1;
        }

        return curr;
    }
}
