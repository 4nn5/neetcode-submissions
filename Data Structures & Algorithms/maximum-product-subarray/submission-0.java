class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        int[] max_dp = new int[n];
        int[] min_dp = new int[n];
        
        max_dp[0] = nums[0];
        min_dp[0] = nums[0];
        int result = nums[0]; 
        
        for (int i = 1; i < n; i++) {
            int currentNum = nums[i];
            
            int choice1 = currentNum;
            int choice2 = max_dp[i - 1] * currentNum;
            int choice3 = min_dp[i - 1] * currentNum;
            
            max_dp[i] = Math.max(choice1, Math.max(choice2, choice3));
            min_dp[i] = Math.min(choice1, Math.min(choice2, choice3));
            result = Math.max(result, max_dp[i]);
        }
        
        return result;
    }
}